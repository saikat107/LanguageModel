<METHOD_START> @ Test public void void ( ) java.lang.Exception { Snake samples.websocket.jetty.snake.Snake = mock ( Snake .class ) ; willThrow ( new java.io.IOException ( ) ) . given ( samples.websocket.jetty.snake.Snake ) . sendMessage ( anyString ( ) ) ; SnakeTimer . addSnake ( samples.websocket.jetty.snake.Snake ) ; SnakeTimer . broadcast ( STRING ) ; assertThat ( SnakeTimer . getSnakes ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>