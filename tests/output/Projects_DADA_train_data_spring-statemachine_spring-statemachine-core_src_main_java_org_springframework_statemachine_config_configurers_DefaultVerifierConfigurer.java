<METHOD_START> @ java.lang.Override public void void ( StateMachineConfigurationBuilder < S , E > org.springframework.statemachine.config.configurers.StateMachineConfigurationBuilder<S,E> ) throws java.lang.Exception { org.springframework.statemachine.config.configurers.StateMachineConfigurationBuilder<S,E> . setVerifierEnabled ( boolean ) ; if ( org.springframework.statemachine.config.configurers.StateMachineModelVerifier<S,E> != null ) { org.springframework.statemachine.config.configurers.StateMachineConfigurationBuilder<S,E> . setVerifier ( org.springframework.statemachine.config.configurers.StateMachineModelVerifier<S,E> ) ; } else { org.springframework.statemachine.config.configurers.StateMachineConfigurationBuilder<S,E> . setVerifier ( new CompositeStateMachineModelVerifier < S , E > ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.VerifierConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.VerifierConfigurer<S,E> ( boolean boolean ) { this . boolean = boolean ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.VerifierConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.VerifierConfigurer<S,E> ( StateMachineModelVerifier < S , E > org.springframework.statemachine.config.configurers.StateMachineModelVerifier<S,E> ) { this . org.springframework.statemachine.config.configurers.StateMachineModelVerifier<S,E> = org.springframework.statemachine.config.configurers.StateMachineModelVerifier<S,E> ; return this ; }  <METHOD_END>