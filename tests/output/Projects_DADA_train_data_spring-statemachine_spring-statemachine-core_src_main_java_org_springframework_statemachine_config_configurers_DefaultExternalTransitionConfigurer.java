<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionBuilder < S , E > org.springframework.statemachine.config.configurers.StateMachineTransitionBuilder<S,E> ) throws java.lang.Exception { org.springframework.statemachine.config.configurers.StateMachineTransitionBuilder<S,E> . addTransition ( getSource ( ) , getTarget ( ) , getState ( ) , getEvent ( ) , getPeriod ( ) , getCount ( ) , getActions ( ) , getGuard ( ) , TransitionKind . EXTERNAL , getSecurityRule ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( S S ) { setSource ( S ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( S S ) { setTarget ( S ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( S S ) { setState ( S ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( E E ) { setEvent ( E ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( long long ) { setPeriod ( long ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( long long ) { setPeriod ( long ) ; setCount ( NUMBER ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( Action < S , E > org.springframework.statemachine.config.configurers.Action<S,E> ) { return org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( org.springframework.statemachine.config.configurers.Action<S,E> , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( Action < S , E > org.springframework.statemachine.config.configurers.Action<S,E> , Action < S , E > org.springframework.statemachine.config.configurers.Action<S,E> ) { addAction ( org.springframework.statemachine.config.configurers.Action<S,E> , org.springframework.statemachine.config.configurers.Action<S,E> ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( Guard < S , E > org.springframework.statemachine.config.configurers.Guard<S,E> ) { setGuard ( org.springframework.statemachine.config.configurers.Guard<S,E> ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( java.lang.String java.lang.String ) { SpelExpressionParser org.springframework.statemachine.config.configurers.SpelExpressionParser = new SpelExpressionParser ( new SpelParserConfiguration ( SpelCompilerMode . MIXED , null ) ) ; setGuard ( new SpelExpressionGuard < S , E > ( org.springframework.statemachine.config.configurers.SpelExpressionParser . parseExpression ( java.lang.String ) ) ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( java.lang.String java.lang.String , ComparisonType org.springframework.statemachine.config.configurers.ComparisonType ) { setSecurityRule ( java.lang.String , org.springframework.statemachine.config.configurers.ComparisonType ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> < S , E > org.springframework.statemachine.config.configurers.ExternalTransitionConfigurer<S,E> ( java.lang.String java.lang.String ) { setSecurityRule ( java.lang.String ) ; return this ; }  <METHOD_END>
