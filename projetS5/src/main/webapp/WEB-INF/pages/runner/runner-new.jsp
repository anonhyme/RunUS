<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"--%>
<%--pageEncoding="ISO-8859-1" %>--%>
<%--<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="../utils/taglib.jsp" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>New User</title>

    <script type="text/javascript">
        function setConnected(connected) {
            document.getElementById('connect').disabled = connected;
            document.getElementById('disconnect').disabled = !connected;
            document.getElementById('conversationDiv').style.visibility = connected ? 'visible' : 'hidden';
            document.getElementById('response').innerHTML = '';
        }
        function connect() {
            if ('WebSocket' in window) {
                console.log('Websocket supported');
                socket = new WebSocket('ws://localhost:8080//fuckyou');

                console.log('Connection attempted');

                socket.onopen = function () {
                    console.log('Connection open!');
                    setConnected(true);
                }

                socket.onclose = function () {
                    console.log('Disconnecting connection');
                }

                socket.onmessage = function (evt) {
                    var received_msg = evt.data;
                    console.log(received_msg);
                    console.log('message received!');
                    showMessage(received_msg);
                }

            } else {
                console.log('Websocket not supported');
            }
        }

        function disconnect() {
            setConnected(false);
            console.log("Disconnected");
        }

        function sendName() {
//            var message = document.getElementById('message').value;
            var message = "hgfdsgfdsafgdsa";

            socket.send(JSON.stringify({'message': message}));
            
        }

        function showMessage(message) {
            var response = document.getElementById('response');
            var p = document.createElement('p');
//            p.style.wordWrap = 'break-word';
            var jsonObj = JSON.parse(message);
            p.appendChild(document.createTextNode(jsonObj.message));
            response.appendChild(p);
        }

    </script>
    
</head>
<body>
<div class="container-fluid">
    <h1>New User</h1>
    <div id="response"></div>
    <form:form method="POST" commandName="runner" action="${pageContext.request.contextPath}/runner/create.html">
        <table>
            <tbody>
            <tr>
                <td>Name:</td>
                <td><form:input path="name"/></td>
                <td><form:errors path="name" cssStyle="color: red;"/></td>
            </tr>
            <tr>
                <td>Height(cm):</td>
                <td><form:input path="runnerHeight"/></td>
                <td><form:errors path="runnerHeight" cssStyle="color: red;"/></td>
            </tr>
            <tr>
                <td>Last run stat:</td>
                <td><form:input path="lastRunStat"/></td>
                <td><form:errors path="lastRunStat" cssStyle="color: red;"/></td>
            </tr>
            <tr>
                <td>Average speed:</td>
                <td><form:input path="runnerAvgSpeed"/></td>
                <td><form:errors path="runnerAvgSpeed" cssStyle="color: red;"/></td>
            </tr>
            <tr>
                <td>Device MAC id:</td>
                <td><form:input path="macId"/></td>
                <td><form:errors path="macId" cssStyle="color: red;"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Create"/></td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </form:form>
    <a href="${pageContext.request.contextPath}/">Home page</a>
</div>
</body>
</html>