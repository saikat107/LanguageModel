<METHOD_START> public void void ( ObjectMapper org.springframework.statemachine.data.support.ObjectMapper ) { this . org.springframework.statemachine.data.support.ObjectMapper = org.springframework.statemachine.data.support.ObjectMapper ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.data.support.ResourceReader org.springframework.statemachine.data.support.ResourceReader ( ) { return new StateMachineJackson2ResourceReader ( org.springframework.statemachine.data.support.ObjectMapper ) ; }  <METHOD_END>