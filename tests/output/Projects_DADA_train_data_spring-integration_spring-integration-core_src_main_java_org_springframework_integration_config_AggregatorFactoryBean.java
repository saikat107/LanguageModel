<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( AbstractMessageHandlerMetrics org.springframework.integration.config.AbstractMessageHandlerMetrics ) { this . org.springframework.integration.config.AbstractMessageHandlerMetrics = org.springframework.integration.config.AbstractMessageHandlerMetrics ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( LockRegistry org.springframework.integration.config.LockRegistry ) { this . org.springframework.integration.config.LockRegistry = org.springframework.integration.config.LockRegistry ; }  <METHOD_END>
<METHOD_START> public void void ( MessageGroupStore org.springframework.integration.config.MessageGroupStore ) { this . org.springframework.integration.config.MessageGroupStore = org.springframework.integration.config.MessageGroupStore ; }  <METHOD_END>
<METHOD_START> public void void ( CorrelationStrategy org.springframework.integration.config.CorrelationStrategy ) { this . org.springframework.integration.config.CorrelationStrategy = org.springframework.integration.config.CorrelationStrategy ; }  <METHOD_END>
<METHOD_START> public void void ( ReleaseStrategy org.springframework.integration.config.ReleaseStrategy ) { this . org.springframework.integration.config.ReleaseStrategy = org.springframework.integration.config.ReleaseStrategy ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.config.Expression ) { this . org.springframework.integration.config.Expression = org.springframework.integration.config.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.integration.config.Advice> < Advice > java.util.List<org.springframework.integration.config.Advice> ) { this . java.util.List<org.springframework.integration.config.Advice> = java.util.List<org.springframework.integration.config.Advice> ; }  <METHOD_END>
<METHOD_START> public void void ( TaskScheduler org.springframework.integration.config.TaskScheduler ) { this . org.springframework.integration.config.TaskScheduler = org.springframework.integration.config.TaskScheduler ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.config.MessageChannel ) { this . org.springframework.integration.config.MessageChannel = org.springframework.integration.config.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.AggregatingMessageHandler org.springframework.integration.config.AggregatingMessageHandler ( ) { MessageGroupProcessor org.springframework.integration.config.MessageGroupProcessor ; if ( this . java.lang.Object instanceof MessageGroupProcessor ) { org.springframework.integration.config.MessageGroupProcessor = ( MessageGroupProcessor ) this . java.lang.Object ; } else { if ( ! StringUtils . hasText ( this . java.lang.String ) ) { org.springframework.integration.config.MessageGroupProcessor = new MethodInvokingMessageGroupProcessor ( this . java.lang.Object ) ; } else { org.springframework.integration.config.MessageGroupProcessor = new MethodInvokingMessageGroupProcessor ( this . java.lang.Object , this . java.lang.String ) ; } } AggregatingMessageHandler org.springframework.integration.config.AggregatingMessageHandler = new AggregatingMessageHandler ( org.springframework.integration.config.MessageGroupProcessor ) ; if ( this . java.lang.Boolean != null ) { org.springframework.integration.config.AggregatingMessageHandler . setExpireGroupsUponCompletion ( this . java.lang.Boolean ) ; } if ( this . java.lang.Long != null ) { org.springframework.integration.config.AggregatingMessageHandler . setSendTimeout ( this . java.lang.Long ) ; } if ( this . java.lang.String != null ) { org.springframework.integration.config.AggregatingMessageHandler . setOutputChannelName ( this . java.lang.String ) ; } if ( this . org.springframework.integration.config.AbstractMessageHandlerMetrics != null ) { org.springframework.integration.config.AggregatingMessageHandler . configureMetrics ( this . org.springframework.integration.config.AbstractMessageHandlerMetrics ) ; } if ( this . java.lang.Boolean != null ) { org.springframework.integration.config.AggregatingMessageHandler . setStatsEnabled ( this . java.lang.Boolean ) ; } if ( this . java.lang.Boolean != null ) { org.springframework.integration.config.AggregatingMessageHandler . setCountsEnabled ( this . java.lang.Boolean ) ; } if ( this . org.springframework.integration.config.LockRegistry != null ) { org.springframework.integration.config.AggregatingMessageHandler . setLockRegistry ( this . org.springframework.integration.config.LockRegistry ) ; } if ( this . org.springframework.integration.config.MessageGroupStore != null ) { org.springframework.integration.config.AggregatingMessageHandler . setMessageStore ( this . org.springframework.integration.config.MessageGroupStore ) ; } if ( this . org.springframework.integration.config.CorrelationStrategy != null ) { org.springframework.integration.config.AggregatingMessageHandler . setCorrelationStrategy ( this . org.springframework.integration.config.CorrelationStrategy ) ; } if ( this . org.springframework.integration.config.ReleaseStrategy != null ) { org.springframework.integration.config.AggregatingMessageHandler . setReleaseStrategy ( this . org.springframework.integration.config.ReleaseStrategy ) ; } if ( this . org.springframework.integration.config.Expression != null ) { org.springframework.integration.config.AggregatingMessageHandler . setGroupTimeoutExpression ( this . org.springframework.integration.config.Expression ) ; } if ( this . java.util.List<org.springframework.integration.config.Advice> != null ) { org.springframework.integration.config.AggregatingMessageHandler . setForceReleaseAdviceChain ( this . java.util.List<org.springframework.integration.config.Advice> ) ; } if ( this . org.springframework.integration.config.TaskScheduler != null ) { org.springframework.integration.config.AggregatingMessageHandler . setTaskScheduler ( this . org.springframework.integration.config.TaskScheduler ) ; } if ( this . org.springframework.integration.config.MessageChannel != null ) { org.springframework.integration.config.AggregatingMessageHandler . setDiscardChannel ( this . org.springframework.integration.config.MessageChannel ) ; } if ( this . java.lang.String != null ) { org.springframework.integration.config.AggregatingMessageHandler . setDiscardChannelName ( this . java.lang.String ) ; } if ( this . java.lang.Boolean != null ) { org.springframework.integration.config.AggregatingMessageHandler . setSendPartialResultOnExpiry ( this . java.lang.Boolean ) ; } if ( this . java.lang.Long != null ) { org.springframework.integration.config.AggregatingMessageHandler . setMinimumTimeoutForEmptyGroups ( this . java.lang.Long ) ; } if ( this . java.lang.Boolean != null ) { org.springframework.integration.config.AggregatingMessageHandler . setExpireGroupsUponTimeout ( this . java.lang.Boolean ) ; } return org.springframework.integration.config.AggregatingMessageHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<? extends org.springframework.integration.config.MessageHandler> < ? extends MessageHandler > java.lang.Class<? extends org.springframework.integration.config.MessageHandler> ( ) { return AggregatingMessageHandler .class ; }  <METHOD_END>
