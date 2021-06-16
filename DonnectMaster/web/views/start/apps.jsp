<%-- 
    Document   : apps
    Created on : Apr 13, 2017, 2:01:58 AM
    Author     : Mohammad
--%>

<!-- PEOPLE APP -->
<div id="people" title="People" ng-app="peopleApp" ng-controller="peopleCtrl">
    <button class="w3-btn w3-gray" ng-click="fetchPeopleFromServer()"><i class="glyphicon glyphicon-retweet"></i> Synchronize with server</button>
    <button class="w3-btn w3-green w3-ripple w3-right" ng-click="editUser('new')">&#9998; Create New Contact</button>
    <div class="w3-container">

        <table class="w3-table w3-bordered w3-striped w3-left" style="width: 65%;">
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Nick Name</th>
                <th>Mobile 1</th>
                <th>Home</th>
                <th>More</th>
            </tr>
            <tr ng-repeat="user in users">
                <td>{{ user.id}}</td>
                <td>{{ user.name}}</td>
                <td>{{ user.family}}</td>
                <td>{{ user.nick}}</td>
                <td>{{ user.mobile1}}</td>
                <td>{{ user.home}}</td>
                <td>
                    <button class="w3-btn w3-ripple" ng-click="editUser(user.id)">&#9998; More</button>
                </td>
            </tr>
        </table>
        <br>

        <form ng-hide="hideform" class="w3-right" style="width: 30%;">
            <h3 ng-show="edit">Create New User:</h3>
            <h3 ng-hide="edit">Edit User:</h3>
            <label>First Name:*</label>
            <input class="w3-input w3-border" type="text" ng-model="fName" placeholder="First Name">
            <br>
            <label>Last Name:*</label>
            <input class="w3-input w3-border" type="text" ng-model="lName" placeholder="Last Name">
            <br>
            <label>Nick Name:</label>
            <input class="w3-input w3-border" type="text" ng-model="nName" placeholder="Nick Name">
            <br>
            <label>Mobile 1:</label>
            <input class="w3-input w3-border" type="text" ng-model="mobi1" placeholder="Mobile 1">
            <br>
            <label>Mobile 2:</label>
            <input class="w3-input w3-border" type="text" ng-model="mobi2" placeholder="Mobile 2">
            <br>
            <label>Mobile 3:</label>
            <input class="w3-input w3-border" type="text" ng-model="mobi3" placeholder="Mobile 3">
            <br>
            <label>Home Number:</label>
            <input class="w3-input w3-border" type="text" ng-model="home" placeholder="Home Number">
            <br>
            <label>Work Number:</label>
            <input class="w3-input w3-border" type="text" ng-model="work" placeholder="Wrok Number">
            <br>
            <label>Other Number:</label>
            <input class="w3-input w3-border" type="text" ng-model="other" placeholder="Home Number">
            <br>
            <label>Address:</label>
            <input class="w3-input w3-border" type="text" ng-model="addr" placeholder="Address">
            <br>
            <label>E-Mail:</label>
            <input class="w3-input w3-border" type="email" ng-model="email" placeholder="E-Mail">
            <br>
            <label>Birthday:</label>
            <input class="w3-input w3-border" type="datetime" ng-model="birth" placeholder="Birthday">
            <br>
            <label>Note:</label>
            <input class="w3-input w3-border" type="text" ng-model="note" placeholder="Note">
            <br>
            <button class="w3-btn w3-green w3-ripple" ng-disabled="error || incomplete">&#10004; Save Changes</button>
            <button class="w3-btn w3-red w3-ripple"> Close</button>
        </form>

    </div>
</div>

<!-- TASK APP -->
<div id="task" title="Home Tasks" ng-app="taskApp" ng-controller="taskCtrl">
    <div class="w3-card-2 w3-margin w3-left" style="max-width:400px;">
        <header class="w3-container w3-light-grey w3-padding-16">
            <h3>Shopping List</h3>
        </header>
        <ul class="w3-ul">
            <li ng-repeat="x in products" class="w3-padding-16">{{x}}<span ng-click="removeProduct($index)" style="cursor:pointer;" class="w3-right w3-margin-right">×</span></li>
        </ul>
        <div class="w3-container w3-light-grey w3-padding-16">
            <div class="w3-row w3-margin-top">
                <div class="w3-col s10">
                    <input placeholder="Add shopping items here" ng-model="addMeP" class="w3-input w3-border w3-padding">
                </div>
                <div class="w3-col s2">
                    <button ng-click="addProduct()" class="w3-btn w3-padding w3-green">Add</button>
                </div>
            </div>
            <p class="w3-padding-left w3-text-red">{{errorproduct}}</p>
        </div>
    </div>

    <button class="w3-btn w3-gray w3-center" ng-click="fetchTaskFromServer()"><i class="glyphicon glyphicon-retweet"></i> Synchronize with server</button>

    <div class="w3-card-2 w3-margin w3-right" style="max-width:400px;">
        <header class="w3-container w3-light-grey w3-padding-16">
            <h3>To Do List</h3>
        </header>
        <ul class="w3-ul">
            <li ng-repeat="y in todos" class="w3-padding-16">{{y}}<span ng-click="removeToDo()($index)" style="cursor:pointer;" class="w3-right w3-margin-right">×</span></li>
        </ul>
        <div class="w3-container w3-light-grey w3-padding-16">
            <div class="w3-row w3-margin-top">
                <div class="w3-col s10">
                    <input placeholder="Add to do items here" ng-model="addMeT" class="w3-input w3-border w3-padding">
                </div>
                <div class="w3-col s2">
                    <button ng-click="addToDo()" class="w3-btn w3-padding w3-green">Add</button>
                </div>
            </div>
            <p class="w3-padding-left w3-text-red">{{errortodo}}</p>
        </div>
    </div>
</div>

<script type="text/javascript" src= "../../js/apps/apps.js"></script>
<script type="text/javascript" src="../../js/jquery-ui-1.12.1.custom/external/jquery/jquery.js"></script>
<script type="text/javascript" src="../../js/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
<script type="text/javascript" src="../../js/start/windows.js"></script>
