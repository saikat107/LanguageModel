<METHOD_START> public void ( int int , WebSocketSession samples.websocket.undertow.snake.WebSocketSession ) { this . int = int ; this . samples.websocket.undertow.snake.WebSocketSession = samples.websocket.undertow.snake.WebSocketSession ; this . java.lang.String = SnakeUtils . getRandomHexColor ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { this . samples.websocket.undertow.snake.Direction = Direction . NONE ; this . samples.websocket.undertow.snake.Location = SnakeUtils . getRandomLocation ( ) ; this . java.util.Deque<samples.websocket.undertow.snake.Location> . clear ( ) ; this . int = int ; }  <METHOD_END>
<METHOD_START> private void void ( ) java.lang.Exception { synchronized ( this . java.lang.Object ) { void ( ) ; void ( STRING ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) java.lang.Exception { synchronized ( this . java.lang.Object ) { this . int ++ ; void ( STRING ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String ) throws java.lang.Exception { this . samples.websocket.undertow.snake.WebSocketSession . sendMessage ( new TextMessage ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Collection<samples.websocket.undertow.snake.Snake> < samples.websocket.undertow.snake.Snake > java.util.Collection<samples.websocket.undertow.snake.Snake> ) throws java.lang.Exception { synchronized ( this . java.lang.Object ) { Location samples.websocket.undertow.snake.Location = this . samples.websocket.undertow.snake.Location . getAdjacentLocation ( this . samples.websocket.undertow.snake.Direction ) ; if ( nextLocation . x >= SnakeUtils . PLAYFIELD_WIDTH ) { nextLocation . x = NUMBER ; } if ( nextLocation . y >= SnakeUtils . PLAYFIELD_HEIGHT ) { nextLocation . y = NUMBER ; } if ( nextLocation . x < NUMBER ) { nextLocation . x = SnakeUtils . PLAYFIELD_WIDTH ; } if ( nextLocation . y < NUMBER ) { nextLocation . y = SnakeUtils . PLAYFIELD_HEIGHT ; } if ( this . samples.websocket.undertow.snake.Direction != Direction . NONE ) { this . java.util.Deque<samples.websocket.undertow.snake.Location> . addFirst ( this . samples.websocket.undertow.snake.Location ) ; if ( this . java.util.Deque<samples.websocket.undertow.snake.Location> . size ( ) > this . int ) { this . java.util.Deque<samples.websocket.undertow.snake.Location> . removeLast ( ) ; } this . samples.websocket.undertow.snake.Location = samples.websocket.undertow.snake.Location ; } void ( java.util.Collection<samples.websocket.undertow.snake.Snake> ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.util.Collection<samples.websocket.undertow.snake.Snake> < samples.websocket.undertow.snake.Snake > java.util.Collection<samples.websocket.undertow.snake.Snake> ) throws java.lang.Exception { for ( samples.websocket.undertow.snake.Snake samples.websocket.undertow.snake.Snake : java.util.Collection<samples.websocket.undertow.snake.Snake> ) { boolean boolean = this . int != samples.websocket.undertow.snake.Snake . int && samples.websocket.undertow.snake.Snake . samples.websocket.undertow.snake.Location ( ) . equals ( this . samples.websocket.undertow.snake.Location ) ; boolean boolean = samples.websocket.undertow.snake.Snake . java.util.Collection<samples.websocket.undertow.snake.Location> ( ) . contains ( this . samples.websocket.undertow.snake.Location ) ; if ( boolean || boolean ) { void ( ) ; if ( this . int != samples.websocket.undertow.snake.Snake . int ) { samples.websocket.undertow.snake.Snake . void ( ) ; } } } }  <METHOD_END>
<METHOD_START> public samples.websocket.undertow.snake.Location samples.websocket.undertow.snake.Location ( ) { synchronized ( this . java.lang.Object ) { return this . samples.websocket.undertow.snake.Location ; } }  <METHOD_END>
<METHOD_START> public java.util.Collection<samples.websocket.undertow.snake.Location> < Location > java.util.Collection<samples.websocket.undertow.snake.Location> ( ) { synchronized ( this . java.lang.Object ) { return this . java.util.Deque<samples.websocket.undertow.snake.Location> ; } }  <METHOD_END>
<METHOD_START> public void void ( Direction samples.websocket.undertow.snake.Direction ) { synchronized ( this . java.lang.Object ) { this . samples.websocket.undertow.snake.Direction = samples.websocket.undertow.snake.Direction ; } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { synchronized ( this . java.lang.Object ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , java.lang.Integer . java.lang.Integer ( this . samples.websocket.undertow.snake.Location . x ) , java.lang.Integer . java.lang.Integer ( this . samples.websocket.undertow.snake.Location . y ) ) ) ; for ( Location samples.websocket.undertow.snake.Location : this . java.util.Deque<samples.websocket.undertow.snake.Location> ) { java.lang.StringBuilder . java.lang.StringBuilder ( ',' ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , java.lang.Integer . java.lang.Integer ( location . x ) , java.lang.Integer . java.lang.Integer ( location . y ) ) ) ; } return java.lang.String . java.lang.String ( STRING , java.lang.Integer . java.lang.Integer ( this . int ) , java.lang.StringBuilder . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>