<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestListener org.springframework.statemachine.security.TestListener = new TestListener ( ) ; StateMachine < States , Events > org.springframework.statemachine.security.StateMachine<org.springframework.statemachine.security.States,org.springframework.statemachine.security.Events> = buildMachine ( org.springframework.statemachine.security.TestListener , STRING , ComparisonType . ANY , null ) ; assertTransitionDenied ( org.springframework.statemachine.security.StateMachine<org.springframework.statemachine.security.States,org.springframework.statemachine.security.Events> , org.springframework.statemachine.security.TestListener ) ; }  <METHOD_END>
<METHOD_START> @ Test @ WithMockUser ( roles = { STRING } ) public void void ( ) java.lang.Exception { TestListener org.springframework.statemachine.security.TestListener = new TestListener ( ) ; StateMachine < States , Events > org.springframework.statemachine.security.StateMachine<org.springframework.statemachine.security.States,org.springframework.statemachine.security.Events> = buildMachine ( org.springframework.statemachine.security.TestListener , null , null , null , null , null , STRING ) ; assertTransitionDenied ( org.springframework.statemachine.security.StateMachine<org.springframework.statemachine.security.States,org.springframework.statemachine.security.Events> , org.springframework.statemachine.security.TestListener ) ; }  <METHOD_END>
<METHOD_START> @ Test @ WithMockUser ( roles = { STRING } ) public void void ( ) java.lang.Exception { TestListener org.springframework.statemachine.security.TestListener = new TestListener ( ) ; StateMachine < States , Events > org.springframework.statemachine.security.StateMachine<org.springframework.statemachine.security.States,org.springframework.statemachine.security.Events> = buildMachine ( org.springframework.statemachine.security.TestListener , null , null , null , STRING , ComparisonType . ALL , null ) ; assertTransitionDenied ( org.springframework.statemachine.security.StateMachine<org.springframework.statemachine.security.States,org.springframework.statemachine.security.Events> , org.springframework.statemachine.security.TestListener ) ; }  <METHOD_END>
<METHOD_START> @ Test @ WithMockUser ( roles = { STRING } ) public void void ( ) java.lang.Exception { TestListener org.springframework.statemachine.security.TestListener = new TestListener ( ) ; StateMachine < States , Events > org.springframework.statemachine.security.StateMachine<org.springframework.statemachine.security.States,org.springframework.statemachine.security.Events> = buildMachine ( org.springframework.statemachine.security.TestListener , null , null , null , STRING , ComparisonType . ALL , null ) ; assertTransitionAllowed ( org.springframework.statemachine.security.StateMachine<org.springframework.statemachine.security.States,org.springframework.statemachine.security.Events> , org.springframework.statemachine.security.TestListener ) ; }  <METHOD_END>