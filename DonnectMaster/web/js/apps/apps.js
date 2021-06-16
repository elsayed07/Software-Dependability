/* 
 * The MIT License
 *
 * Copyright 2017 Mohammad.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/////////////////////////////////// PEOPLE APP ////////////////////////////////
var peopleApp = angular.module('peopleApp', []);
peopleApp.controller('peopleCtrl', function ($scope, $http) {
    var dataToPost = {command: "fetch"}; /* PostData*/
    var queryParams = {params: {app: 'people', command: 'fetch'}};/* Query Parameters*/

    $http.post("../../AppsServlet", dataToPost, queryParams)
            .success(function (serverResponse, status, headers, config) {
                $scope.users = serverResponse;
            }).error(function (serverResponse, status, headers, config) {
        $scope.error = serverResponse;
        alert("failure");
    }
    );

    $scope.fetchPeopleFromServer = function () {
        $http.post("../../AppsServlet", dataToPost, queryParams)
                .success(function (serverResponse, status, headers, config) {
                    $scope.users = serverResponse;
                }).error(function (serverResponse, status, headers, config) {
            $scope.error = serverResponse;
            alert("failure");
        }
        );
    };

    $scope.edit = true;
    $scope.error = false;
    $scope.incomplete = false;
    $scope.hideform = true;
    $scope.editUser = function (id) {
        $scope.hideform = false;
        if (id === 'new') {
            $scope.edit = true;
            $scope.incomplete = true;
            $scope.fName = '';
            $scope.lName = '';
            $scope.nName = '';
            $scope.mob1 = '';
            $scope.mob2 = '';
            $scope.mob3 = '';
            $scope.home = '';
            $scope.work = '';
            $scope.other = '';
            $scope.addr = '';
            $scope.email = '';
            $scope.birth = '';
            $scope.note = '';
        } else {
            $scope.edit = false;
            $scope.fName = $scope.users[id - 1].name;
            $scope.lName = $scope.users[id - 1].family;
            $scope.nName = $scope.users[id - 1].nick;
            $scope.mobi1 = $scope.users[id - 1].mobile1;
            $scope.mobi2 = $scope.users[id - 1].mobile2;
            $scope.mobi3 = $scope.users[id - 1].mobile3;
            $scope.home = $scope.users[id - 1].home;
            $scope.work = $scope.users[id - 1].work;
            $scope.other = $scope.users[id - 1].other;
            $scope.addr = $scope.users[id - 1].address;
            $scope.email = $scope.users[id - 1].email;
            $scope.birth = $scope.users[id - 1].birthday;
            $scope.note = $scope.users[id - 1].note;
        }
    };

////    $scope.$watch('passw1', function () {
////        $scope.test();
////    });
////    $scope.$watch('passw2', function () {
////        $scope.test();
////    });
    $scope.$watch('fName', function () {
        $scope.test();
    });
    $scope.$watch('lName', function () {
        $scope.test();
    });
////
    $scope.test = function () {
//        if ($scope.passw1 !== $scope.passw2) {
//            $scope.error = true;
//        } else {
//            $scope.error = false;
//        }
        $scope.incomplete = false;
        if ($scope.edit && (!$scope.fName.length ||
                !$scope.lName.length ||
                !$scope.passw1.length || !$scope.passw2.length)) {
            $scope.incomplete = true;
        }
    };

});

/////////////////////////////////// TASK APP //////////////////////////////////
var taskApp = angular.module('taskApp', []);
taskApp.controller('taskCtrl', function ($scope) {

    $scope.fetchTaskFromServer = function () {
        $scope.products = ["Milk", "Bread", "Cheese", "Beer"]; // TODO: Fetch from server
        $scope.todos = ["Fix water warmer", "Fuse cooler", "Fix w.c. door"]; // TODO: Fetch from server
    };

    $scope.products = ["Milk", "Bread", "Cheese"]; // TODO: Fetch from server
    $scope.addProduct = function () {
        $scope.errorproduct = "";
        if (!$scope.addMeP) {
            return;
        }
        if ($scope.products.indexOf($scope.addMeP) === -1) {
            // TODO: Add to server!
            $scope.products.push($scope.addMeP);
        } else {
            $scope.errorproduct = "The item is already in your shopping list.";
        }
    };

    $scope.removeProduct = function (x) {
        $scope.errorproduct = "";
        // TODO: Remove from server!
        $scope.products.splice(x, 1);
    };

    $scope.todos = ["تعمیر آبگرمکن", "راه‌اندازی کولر", "تعمیر در دستشویی"]; // TODO: Fetch from server
    $scope.addToDo = function () {
        $scope.errortodo = "";
        if (!$scope.addMeT) {
            return;
        }
        if ($scope.todos.indexOf($scope.addMeT) === -1) {
            // TODO: Add to server!
            $scope.todos.push($scope.addMeT);
        } else {
            $scope.errortodo = "The item is already in your shopping list.";
        }
    };

    $scope.removeToDo = function (x) {
        $scope.errortodo = "";
        // TODO: Remove from server!
        $scope.todos.splice(x, 1);
    };
});

angular.bootstrap(document.getElementById("task"), ['taskApp']);

/////////////////////////////////// X APP //////////////////////////////////
