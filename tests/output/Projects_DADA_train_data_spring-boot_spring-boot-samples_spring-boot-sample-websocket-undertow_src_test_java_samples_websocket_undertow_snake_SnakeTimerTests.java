<METHOD_START> @ Test public void void ( ) java.lang.Exception { Snake samples.websocket.undertow.snake.Snake = mock ( Snake .class ) ; willThrow ( new java.io.IOException ( ) ) . given ( samples.websocket.undertow.snake.Snake ) . sendMessage ( anyString ( ) ) ; SnakeTimer . addSnake ( samples.websocket.undertow.snake.Snake ) ; SnakeTimer . broadcast ( STRING ) ; assertThat ( SnakeTimer . getSnakes ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>