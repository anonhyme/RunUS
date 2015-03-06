
<%@include file="/resources/utils/taglib.jsp"%>

<script src="<c:url value="/resources/sockjs-0.3.4.js"/>"></script>
<script src="<c:url value="/resources/stomp.js"/>"></script>
<script type="text/javascript">
    var stompClient = null;

    function setConnected(connected) {
        document.getElementById('connect').disabled = connected;
        document.getElementById('disconnect').disabled = !connected;
        document.getElementById('conversationDiv').style.visibility = connected ? 'visible' : 'hidden';
        document.getElementById('response').innerHTML = '';
    }

    function connect() {
        var socket = new SockJS('/hello');
        stompClient = Stomp.over(socket);
        stompClient.connect({}, function (frame) {
            setConnected(true);
            console.log('Connected: ' + frame);
            stompClient.subscribe('/topic/greetings', function (greeting) {
                showGreeting(JSON.parse(greeting.body).content);
            });
        });
    }

    function disconnect() {
        stompClient.disconnect();
        setConnected(false);
        console.log("Disconnected");
    }

    function sendName() {
        var name = document.getElementById('name').value;
        stompClient.send("/app/hello", {}, JSON.stringify({'name': name}));
    }

    function showGreeting(message) {
        var response = document.getElementById('response');
        var p = document.createElement('p');
        p.style.wordWrap = 'break-word';
        p.appendChild(document.createTextNode(message));
        response.appendChild(p);
    }
    connect();
</script>