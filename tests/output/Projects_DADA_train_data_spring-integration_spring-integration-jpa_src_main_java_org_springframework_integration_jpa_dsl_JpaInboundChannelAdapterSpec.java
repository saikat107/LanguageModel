<METHOD_START> void ( JpaExecutor org.springframework.integration.jpa.dsl.JpaExecutor ) { this . org.springframework.integration.jpa.dsl.JpaExecutor = org.springframework.integration.jpa.dsl.JpaExecutor ; this . target = new JpaPollingChannelAdapter ( this . org.springframework.integration.jpa.dsl.JpaExecutor ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setEntityClass ( java.lang.Class<> ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( java.lang.String java.lang.String ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setJpaQuery ( java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( java.lang.String java.lang.String ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setNativeQuery ( java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( java.lang.String java.lang.String ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setNamedQuery ( java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( boolean boolean ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setDeleteAfterPoll ( boolean ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( boolean boolean ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setDeleteInBatch ( boolean ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( boolean boolean ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setFlush ( boolean ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( ParameterSource org.springframework.integration.jpa.dsl.ParameterSource ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setParameterSource ( org.springframework.integration.jpa.dsl.ParameterSource ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( boolean boolean ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setExpectSingleResult ( boolean ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( int int ) { return org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( new ValueExpression <> ( int ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( java.lang.String java.lang.String ) { return org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( PARSER . parseExpression ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec org.springframework.integration.jpa.dsl.JpaInboundChannelAdapterSpec ( Expression org.springframework.integration.jpa.dsl.Expression ) { this . org.springframework.integration.jpa.dsl.JpaExecutor . setMaxResultsExpression ( org.springframework.integration.jpa.dsl.Expression ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<java.lang.Object> < java.lang.Object > java.util.Collection<java.lang.Object> ( ) { return java.util.Collections . java.util.List ( this . org.springframework.integration.jpa.dsl.JpaExecutor ) ; }  <METHOD_END>
