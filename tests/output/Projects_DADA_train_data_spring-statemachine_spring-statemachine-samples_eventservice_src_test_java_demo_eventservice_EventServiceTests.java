<METHOD_START> @ Test public void void ( ) java.lang.Exception { demo.eventservice.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { demo.eventservice.MockMvc . perform ( get ( STRING ) . param ( STRING , STRING ) . param ( STRING , STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { demo.eventservice.MockMvc . perform ( get ( STRING ) . param ( STRING , STRING ) . param ( STRING , STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; demo.eventservice.MockMvc . perform ( get ( STRING ) . param ( STRING , STRING ) . param ( STRING , STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { demo.eventservice.MockMvc . perform ( post ( STRING ) . content ( STRING ) . contentType ( MediaType . APPLICATION_JSON ) ) . andExpect ( status ( ) . isOk ( ) ) ; demo.eventservice.MockMvc . perform ( post ( STRING ) . content ( STRING ) . contentType ( MediaType . APPLICATION_JSON ) ) . andExpect ( status ( ) . isOk ( ) ) ; demo.eventservice.MockMvc . perform ( get ( STRING ) . param ( STRING , STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) java.lang.Exception { demo.eventservice.MockMvc = MockMvcBuilders . webAppContextSetup ( demo.eventservice.WebApplicationContext ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.eventservice.StateMachinePersist<demo.eventservice.States,demo.eventservice.Events,java.lang.String> < States , Events , java.lang.String > demo.eventservice.StateMachinePersist<demo.eventservice.States,demo.eventservice.Events,java.lang.String> ( ) { return new demo.eventservice.EventServiceTests.InMemoryStateMachinePersist ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineContext < States , Events > demo.eventservice.StateMachineContext<demo.eventservice.States,demo.eventservice.Events> , java.lang.String java.lang.String ) throws java.lang.Exception { java.util.HashMap<java.lang.String,demo.eventservice.StateMachineContext<demo.eventservice.States,demo.eventservice.Events>> . put ( java.lang.String , demo.eventservice.StateMachineContext<demo.eventservice.States,demo.eventservice.Events> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public demo.eventservice.StateMachineContext<demo.eventservice.States,demo.eventservice.Events> < States , Events > demo.eventservice.StateMachineContext<demo.eventservice.States,demo.eventservice.Events> ( java.lang.String java.lang.String ) throws java.lang.Exception { return java.util.HashMap<java.lang.String,demo.eventservice.StateMachineContext<demo.eventservice.States,demo.eventservice.Events>> . get ( java.lang.String ) ; }  <METHOD_END>
