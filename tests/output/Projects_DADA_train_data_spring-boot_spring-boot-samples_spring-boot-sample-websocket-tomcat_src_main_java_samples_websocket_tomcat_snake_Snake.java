<METHOD_START> public void ( int int , WebSocketSession samples.websocket.tomcat.snake.WebSocketSession ) { this . int = int ; this . samples.websocket.tomcat.snake.WebSocketSession = samples.websocket.tomcat.snake.WebSocketSession ; this . java.lang.String = SnakeUtils . getRandomHexColor ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { this . samples.websocket.tomcat.snake.Direction = Direction . NONE ; this . samples.websocket.tomcat.snake.Location = SnakeUtils . getRandomLocation ( ) ; this . java.util.Deque<samples.websocket.tomcat.snake.Location> . clear ( ) ; this . int = int ; }  <METHOD_END>
<METHOD_START> private void void ( ) java.lang.Exception { synchronized ( this . java.lang.Object ) { void ( ) ; void ( STRING ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) java.lang.Exception { synchronized ( this . java.lang.Object ) { this . int ++ ; void ( STRING ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String ) throws java.lang.Exception { this . samples.websocket.tomcat.snake.WebSocketSession . sendMessage ( new TextMessage ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Collection<samples.websocket.tomcat.snake.Snake> < samples.websocket.tomcat.snake.Snake > java.util.Collection<samples.websocket.tomcat.snake.Snake> ) throws java.lang.Exception { synchronized ( this . java.lang.Object ) { Location samples.websocket.tomcat.snake.Location = this . samples.websocket.tomcat.snake.Location . getAdjacentLocation ( this . samples.websocket.tomcat.snake.Direction ) ; if ( nextLocation . x >= SnakeUtils . PLAYFIELD_WIDTH ) { nextLocation . x = NUMBER ; } if ( nextLocation . y >= SnakeUtils . PLAYFIELD_HEIGHT ) { nextLocation . y = NUMBER ; } if ( nextLocation . x < NUMBER ) { nextLocation . x = SnakeUtils . PLAYFIELD_WIDTH ; } if ( nextLocation . y < NUMBER ) { nextLocation . y = SnakeUtils . PLAYFIELD_HEIGHT ; } if ( this . samples.websocket.tomcat.snake.Direction != Direction . NONE ) { this . java.util.Deque<samples.websocket.tomcat.snake.Location> . addFirst ( this . samples.websocket.tomcat.snake.Location ) ; if ( this . java.util.Deque<samples.websocket.tomcat.snake.Location> . size ( ) > this . int ) { this . java.util.Deque<samples.websocket.tomcat.snake.Location> . removeLast ( ) ; } this . samples.websocket.tomcat.snake.Location = samples.websocket.tomcat.snake.Location ; } void ( java.util.Collection<samples.websocket.tomcat.snake.Snake> ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.util.Collection<samples.websocket.tomcat.snake.Snake> < samples.websocket.tomcat.snake.Snake > java.util.Collection<samples.websocket.tomcat.snake.Snake> ) throws java.lang.Exception { for ( samples.websocket.tomcat.snake.Snake samples.websocket.tomcat.snake.Snake : java.util.Collection<samples.websocket.tomcat.snake.Snake> ) { boolean boolean = this . int != samples.websocket.tomcat.snake.Snake . int && samples.websocket.tomcat.snake.Snake . samples.websocket.tomcat.snake.Location ( ) . equals ( this . samples.websocket.tomcat.snake.Location ) ; boolean boolean = samples.websocket.tomcat.snake.Snake . java.util.Collection<samples.websocket.tomcat.snake.Location> ( ) . contains ( this . samples.websocket.tomcat.snake.Location ) ; if ( boolean || boolean ) { void ( ) ; if ( this . int != samples.websocket.tomcat.snake.Snake . int ) { samples.websocket.tomcat.snake.Snake . void ( ) ; } } } }  <METHOD_END>
<METHOD_START> public samples.websocket.tomcat.snake.Location samples.websocket.tomcat.snake.Location ( ) { synchronized ( this . java.lang.Object ) { return this . samples.websocket.tomcat.snake.Location ; } }  <METHOD_END>
<METHOD_START> public java.util.Collection<samples.websocket.tomcat.snake.Location> < Location > java.util.Collection<samples.websocket.tomcat.snake.Location> ( ) { synchronized ( this . java.lang.Object ) { return this . java.util.Deque<samples.websocket.tomcat.snake.Location> ; } }  <METHOD_END>
<METHOD_START> public void void ( Direction samples.websocket.tomcat.snake.Direction ) { synchronized ( this . java.lang.Object ) { this . samples.websocket.tomcat.snake.Direction = samples.websocket.tomcat.snake.Direction ; } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { synchronized ( this . java.lang.Object ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , java.lang.Integer . java.lang.Integer ( this . samples.websocket.tomcat.snake.Location . x ) , java.lang.Integer . java.lang.Integer ( this . samples.websocket.tomcat.snake.Location . y ) ) ) ; for ( Location samples.websocket.tomcat.snake.Location : this . java.util.Deque<samples.websocket.tomcat.snake.Location> ) { java.lang.StringBuilder . java.lang.StringBuilder ( ',' ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , java.lang.Integer . java.lang.Integer ( location . x ) , java.lang.Integer . java.lang.Integer ( location . y ) ) ) ; } return java.lang.String . java.lang.String ( STRING , java.lang.Integer . java.lang.Integer ( this . int ) , java.lang.StringBuilder . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
