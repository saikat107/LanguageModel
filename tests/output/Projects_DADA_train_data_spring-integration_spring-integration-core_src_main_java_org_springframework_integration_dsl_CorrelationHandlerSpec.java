<METHOD_START> protected void ( H H ) { super( H ); H . setForceReleaseAdviceChain ( this . java.util.List<org.springframework.integration.dsl.Advice> ) ; }  <METHOD_END>
<METHOD_START> public S S ( MessageGroupStore org.springframework.integration.dsl.MessageGroupStore ) { Assert . notNull ( org.springframework.integration.dsl.MessageGroupStore , STRING ) ; this . handler . setMessageStore ( org.springframework.integration.dsl.MessageGroupStore ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . handler . setSendPartialResultOnExpiry ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( long long ) { this . handler . setMinimumTimeoutForEmptyGroups ( long ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( long long ) { this . handler . setGroupTimeoutExpression ( new ValueExpression <> ( long ) ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . handler . setGroupTimeoutExpression ( PARSER . parseExpression ( java.lang.String ) ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.util.function.Function<org.springframework.integration.dsl.MessageGroup,java.lang.Long> < MessageGroup , java.lang.Long > java.util.function.Function<org.springframework.integration.dsl.MessageGroup,java.lang.Long> ) { this . handler . setGroupTimeoutExpression ( new FunctionExpression <> ( java.util.function.Function<org.springframework.integration.dsl.MessageGroup,java.lang.Long> ) ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( TaskScheduler org.springframework.integration.dsl.TaskScheduler ) { Assert . notNull ( org.springframework.integration.dsl.TaskScheduler , STRING ) ; this . handler . setTaskScheduler ( org.springframework.integration.dsl.TaskScheduler ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( MessageChannel org.springframework.integration.dsl.MessageChannel ) { Assert . notNull ( org.springframework.integration.dsl.MessageChannel , STRING ) ; this . handler . setDiscardChannel ( org.springframework.integration.dsl.MessageChannel ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . handler . setDiscardChannelName ( java.lang.String ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.Object java.lang.Object ) { try { CorrelationStrategyFactoryBean org.springframework.integration.dsl.CorrelationStrategyFactoryBean = new CorrelationStrategyFactoryBean ( ) ; org.springframework.integration.dsl.CorrelationStrategyFactoryBean . setTarget ( java.lang.Object ) ; org.springframework.integration.dsl.CorrelationStrategyFactoryBean . afterPropertiesSet ( ) ; ReleaseStrategyFactoryBean org.springframework.integration.dsl.ReleaseStrategyFactoryBean = new ReleaseStrategyFactoryBean ( ) ; org.springframework.integration.dsl.ReleaseStrategyFactoryBean . setTarget ( java.lang.Object ) ; org.springframework.integration.dsl.ReleaseStrategyFactoryBean . afterPropertiesSet ( ) ; return S ( org.springframework.integration.dsl.CorrelationStrategyFactoryBean . getObject ( ) ) . releaseStrategy ( org.springframework.integration.dsl.ReleaseStrategyFactoryBean . getObject ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { return S ( new ExpressionEvaluatingCorrelationStrategy ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { try { CorrelationStrategyFactoryBean org.springframework.integration.dsl.CorrelationStrategyFactoryBean = new CorrelationStrategyFactoryBean ( ) ; org.springframework.integration.dsl.CorrelationStrategyFactoryBean . setTarget ( java.lang.Object ) ; org.springframework.integration.dsl.CorrelationStrategyFactoryBean . setMethodName ( java.lang.String ) ; org.springframework.integration.dsl.CorrelationStrategyFactoryBean . afterPropertiesSet ( ) ; return S ( org.springframework.integration.dsl.CorrelationStrategyFactoryBean . getObject ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> public S S ( CorrelationStrategy org.springframework.integration.dsl.CorrelationStrategy ) { this . handler . setCorrelationStrategy ( org.springframework.integration.dsl.CorrelationStrategy ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { return S ( new ExpressionEvaluatingReleaseStrategy ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { try { ReleaseStrategyFactoryBean org.springframework.integration.dsl.ReleaseStrategyFactoryBean = new ReleaseStrategyFactoryBean ( ) ; org.springframework.integration.dsl.ReleaseStrategyFactoryBean . setTarget ( java.lang.Object ) ; org.springframework.integration.dsl.ReleaseStrategyFactoryBean . setMethodName ( java.lang.String ) ; org.springframework.integration.dsl.ReleaseStrategyFactoryBean . afterPropertiesSet ( ) ; return S ( org.springframework.integration.dsl.ReleaseStrategyFactoryBean . getObject ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> public S S ( ReleaseStrategy org.springframework.integration.dsl.ReleaseStrategy ) { this . handler . setReleaseStrategy ( org.springframework.integration.dsl.ReleaseStrategy ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . handler . setExpireGroupsUponTimeout ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( Advice ... org.springframework.integration.dsl.Advice[] ) { this . java.util.List<org.springframework.integration.dsl.Advice> . addAll ( java.util.Arrays . java.util.List ( org.springframework.integration.dsl.Advice[] ) ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( LockRegistry org.springframework.integration.dsl.LockRegistry ) { Assert . notNull ( org.springframework.integration.dsl.LockRegistry , STRING ) ; this . handler . setLockRegistry ( org.springframework.integration.dsl.LockRegistry ) ; return _this ( ) ; }  <METHOD_END>
