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

var globe_width = screen.width * 0.8;
var globe_height = screen.height * 0.75;

/////////////////////////////////// PEOPLE APP ////////////////////////////////
$("#people").dialog({
    autoOpen: false,
    width: globe_width,
    height: globe_height
});

$("#a").dblclick(function () {
    $("#people").dialog("open");
    //    document.getElementById("task-bar") => Add running app to task bar (people)
});

// Hover states on the static widgets
$("#a, #icons li").hover(
        function () {
            $(this).addClass("ui-state-hover");
        },
        function () {
            $(this).removeClass("ui-state-hover");
        }
);

/////////////////////////////////// TASK APP //////////////////////////////////
$("#task").dialog({
    autoOpen: false,
    width: globe_width,
    height: globe_height
});

$("#b").dblclick(function () {
    $("#task").dialog("open");
    //    document.getElementById("task-bar") => Add running app to task bar (people)
});

$("#b, #icons li").hover(
        function () {
            $(this).addClass("ui-state-hover");
        },
        function () {
            $(this).removeClass("ui-state-hover");
        }
);

/////////////////////////////////// X APP //////////////////////////////////
