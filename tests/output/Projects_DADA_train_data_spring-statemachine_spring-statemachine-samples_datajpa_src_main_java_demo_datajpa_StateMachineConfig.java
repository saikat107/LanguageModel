<METHOD_START> @ Bean public demo.datajpa.StateMachineJackson2RepositoryPopulatorFactoryBean demo.datajpa.StateMachineJackson2RepositoryPopulatorFactoryBean ( ) { StateMachineJackson2RepositoryPopulatorFactoryBean demo.datajpa.StateMachineJackson2RepositoryPopulatorFactoryBean = new StateMachineJackson2RepositoryPopulatorFactoryBean ( ) ; demo.datajpa.StateMachineJackson2RepositoryPopulatorFactoryBean . setResources ( new Resource [] { new ClassPathResource ( STRING ) } ) ; return demo.datajpa.StateMachineJackson2RepositoryPopulatorFactoryBean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineModelConfigurer < java.lang.String , java.lang.String > demo.datajpa.StateMachineModelConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { demo.datajpa.StateMachineModelConfigurer<java.lang.String,java.lang.String> . withModel ( ) . factory ( demo.datajpa.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.datajpa.StateMachineModelFactory<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > demo.datajpa.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) { return new RepositoryStateMachineModelFactory ( demo.datajpa.StateRepository<> , demo.datajpa.TransitionRepository<> ) ; }  <METHOD_END>
