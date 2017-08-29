<METHOD_START> @ java.lang.Override protected org.springframework.web.socket.sockjs.transport.session.TestSockJsSession org.springframework.web.socket.sockjs.transport.session.TestSockJsSession ( ) { return new TestSockJsSession ( STRING , this . sockJsConfig , this . webSocketHandler , java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Thread . void ( NUMBER ) ; long long = this . session . getTimeSinceLastActive ( ) ; assertTrue ( long > NUMBER ) ; java.lang.Thread . void ( NUMBER ) ; long long = this . session . getTimeSinceLastActive ( ) ; assertTrue ( long > long ) ; this . session . delegateConnectionEstablished ( ) ; java.lang.Thread . void ( NUMBER ) ; this . session . setActive ( false ) ; assertTrue ( this . session . getTimeSinceLastActive ( ) > NUMBER ) ; this . session . setActive ( true ) ; assertEquals ( NUMBER , this . session . getTimeSinceLastActive ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNew ( ) ; this . session . delegateConnectionEstablished ( ) ; assertOpen ( ) ; verify ( this . webSocketHandler ) . afterConnectionEstablished ( this . session ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Exception java.lang.Exception = new java.lang.Exception ( ) ; this . session . delegateError ( java.lang.Exception ) ; verify ( this . webSocketHandler ) . handleTransportError ( this . session , java.lang.Exception ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; this . session . delegateMessages ( java.lang.String , java.lang.String ) ; verify ( this . webSocketHandler ) . handleMessage ( this . session , new TextMessage ( java.lang.String ) ) ; verify ( this . webSocketHandler ) . handleMessage ( this . session , new TextMessage ( java.lang.String ) ) ; verifyNoMoreInteractions ( this . webSocketHandler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebSocketHandler org.springframework.web.socket.sockjs.transport.session.WebSocketHandler = new ExceptionWebSocketHandlerDecorator ( this . webSocketHandler ) ; TestSockJsSession org.springframework.web.socket.sockjs.transport.session.TestSockJsSession = new TestSockJsSession ( STRING , this . sockJsConfig , org.springframework.web.socket.sockjs.transport.session.WebSocketHandler , java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; willThrow ( new java.io.IOException ( ) ) . given ( this . webSocketHandler ) . handleMessage ( org.springframework.web.socket.sockjs.transport.session.TestSockJsSession , new TextMessage ( java.lang.String ) ) ; org.springframework.web.socket.sockjs.transport.session.TestSockJsSession . delegateConnectionEstablished ( ) ; try { org.springframework.web.socket.sockjs.transport.session.TestSockJsSession . delegateMessages ( java.lang.String , java.lang.String , java.lang.String ) ; fail ( STRING ) ; } catch ( SockJsMessageDeliveryException org.springframework.web.socket.sockjs.transport.session.SockJsMessageDeliveryException ) { assertEquals ( java.util.Collections . java.util.List<java.lang.String> ( java.lang.String ) , org.springframework.web.socket.sockjs.transport.session.SockJsMessageDeliveryException . getUndeliveredMessages ( ) ) ; verify ( this . webSocketHandler ) . afterConnectionEstablished ( org.springframework.web.socket.sockjs.transport.session.TestSockJsSession ) ; verify ( this . webSocketHandler ) . handleMessage ( org.springframework.web.socket.sockjs.transport.session.TestSockJsSession , new TextMessage ( java.lang.String ) ) ; verify ( this . webSocketHandler ) . handleMessage ( org.springframework.web.socket.sockjs.transport.session.TestSockJsSession , new TextMessage ( java.lang.String ) ) ; verify ( this . webSocketHandler ) . afterConnectionClosed ( org.springframework.web.socket.sockjs.transport.session.TestSockJsSession , CloseStatus . SERVER_ERROR ) ; verifyNoMoreInteractions ( this . webSocketHandler ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . delegateConnectionEstablished ( ) ; this . session . delegateConnectionClosed ( CloseStatus . GOING_AWAY ) ; assertClosed ( ) ; assertEquals ( NUMBER , this . session . getNumberOfLastActiveTimeUpdates ( ) ) ; verify ( this . webSocketHandler ) . afterConnectionClosed ( this . session , CloseStatus . GOING_AWAY ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNew ( ) ; this . session . close ( ) ; assertNull ( STRING , this . session . getCloseStatus ( ) ) ; this . session . delegateConnectionEstablished ( ) ; assertOpen ( ) ; this . session . close ( ) ; assertClosed ( ) ; assertEquals ( NUMBER , this . session . getCloseStatus ( ) . getCode ( ) ) ; this . session . close ( CloseStatus . SERVER_ERROR ) ; assertEquals ( STRING , NUMBER , this . session . getCloseStatus ( ) . getCode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . delegateConnectionEstablished ( ) ; assertOpen ( ) ; this . session . setActive ( false ) ; this . session . close ( ) ; assertEquals ( java.util.Collections . java.util.List<java.lang.Object> ( ) , this . session . getSockJsFramesWritten ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . delegateConnectionEstablished ( ) ; assertOpen ( ) ; this . session . setActive ( true ) ; this . session . close ( ) ; assertEquals ( NUMBER , this . session . getSockJsFramesWritten ( ) . size ( ) ) ; assertEquals ( SockJsFrame . closeFrameGoAway ( ) , this . session . getSockJsFramesWritten ( ) . get ( NUMBER ) ) ; assertEquals ( NUMBER , this . session . getNumberOfLastActiveTimeUpdates ( ) ) ; assertTrue ( this . session . didCancelHeartbeat ( ) ) ; assertEquals ( new CloseStatus ( NUMBER , STRING ) , this . session . getCloseStatus ( ) ) ; assertClosed ( ) ; verify ( this . webSocketHandler ) . afterConnectionClosed ( this . session , new CloseStatus ( NUMBER , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . setExceptionOnWrite ( new java.io.IOException ( ) ) ; this . session . delegateConnectionEstablished ( ) ; this . session . setActive ( true ) ; this . session . close ( ) ; assertEquals ( new CloseStatus ( NUMBER , STRING ) , this . session . getCloseStatus ( ) ) ; assertClosed ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { willThrow ( new java.lang.Exception ( ) ) . given ( this . webSocketHandler ) . afterConnectionClosed ( this . session , CloseStatus . NORMAL ) ; this . session . delegateConnectionEstablished ( ) ; this . session . setActive ( true ) ; this . session . close ( CloseStatus . NORMAL ) ; assertEquals ( CloseStatus . NORMAL , this . session . getCloseStatus ( ) ) ; assertClosed ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . delegateConnectionEstablished ( ) ; this . session . setActive ( true ) ; this . session . tryCloseWithSockJsTransportError ( new java.lang.Exception ( ) , CloseStatus . BAD_DATA ) ; assertEquals ( CloseStatus . BAD_DATA , this . session . getCloseStatus ( ) ) ; assertClosed ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . writeFrame ( SockJsFrame . openFrame ( ) ) ; assertEquals ( NUMBER , this . session . getSockJsFramesWritten ( ) . size ( ) ) ; assertEquals ( SockJsFrame . openFrame ( ) , this . session . getSockJsFramesWritten ( ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . setExceptionOnWrite ( new java.io.IOException ( ) ) ; this . session . delegateConnectionEstablished ( ) ; try { this . session . writeFrame ( SockJsFrame . openFrame ( ) ) ; fail ( STRING ) ; } catch ( SockJsTransportFailureException org.springframework.web.socket.sockjs.transport.session.SockJsTransportFailureException ) { assertEquals ( CloseStatus . SERVER_ERROR , this . session . getCloseStatus ( ) ) ; verify ( this . webSocketHandler ) . afterConnectionClosed ( this . session , CloseStatus . SERVER_ERROR ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . setActive ( true ) ; this . session . sendHeartbeat ( ) ; assertEquals ( NUMBER , this . session . getSockJsFramesWritten ( ) . size ( ) ) ; assertEquals ( SockJsFrame . heartbeatFrame ( ) , this . session . getSockJsFramesWritten ( ) . get ( NUMBER ) ) ; verify ( this . taskScheduler ) . schedule ( any ( java.lang.Runnable .class ) , any ( java.util.Date .class ) ) ; verifyNoMoreInteractions ( this . taskScheduler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . setActive ( false ) ; this . session . scheduleHeartbeat ( ) ; verifyNoMoreInteractions ( this . taskScheduler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . disableHeartbeat ( ) ; this . session . setActive ( true ) ; this . session . sendHeartbeat ( ) ; assertEquals ( java.util.Collections . java.util.List<java.lang.Object> ( ) , this . session . getSockJsFramesWritten ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.concurrent.ScheduledFuture<?> < ? > java.util.concurrent.ScheduledFuture<?> = mock ( java.util.concurrent.ScheduledFuture .class ) ; willReturn ( java.util.concurrent.ScheduledFuture<> ) . given ( this . taskScheduler ) . schedule ( any ( java.lang.Runnable .class ) , any ( java.util.Date .class ) ) ; this . session . setActive ( true ) ; this . session . scheduleHeartbeat ( ) ; verify ( this . taskScheduler ) . schedule ( any ( java.lang.Runnable .class ) , any ( java.util.Date .class ) ) ; verifyNoMoreInteractions ( this . taskScheduler ) ; given ( java.util.concurrent.ScheduledFuture<> . boolean ( ) ) . willReturn ( false ) ; given ( java.util.concurrent.ScheduledFuture<> . boolean ( false ) ) . willReturn ( true ) ; this . session . cancelHeartbeat ( ) ; verify ( java.util.concurrent.ScheduledFuture<> ) . cancel ( false ) ; verifyNoMoreInteractions ( java.util.concurrent.ScheduledFuture<> ) ; }  <METHOD_END>