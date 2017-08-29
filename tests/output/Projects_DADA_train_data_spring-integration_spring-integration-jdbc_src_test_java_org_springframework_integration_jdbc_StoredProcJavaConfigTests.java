<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.jdbc.Message<?> = org.springframework.integration.jdbc.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.jdbc.Message<> ) ; java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) org.springframework.integration.jdbc.Message<> . getPayload ( ) ; assertThat ( java.util.Collection<> , Matchers .< java.lang.Object > contains ( NUMBER , NUMBER , NUMBER , NUMBER ) ) ; org.springframework.integration.jdbc.Message<?> = org.springframework.integration.jdbc.PollableChannel . receive ( NUMBER ) ; assertNull ( org.springframework.integration.jdbc.Message<> ) ; MessagingTemplate org.springframework.integration.jdbc.MessagingTemplate = new MessagingTemplate ( this . org.springframework.integration.jdbc.MessageChannel ) ; org.springframework.integration.jdbc.MessagingTemplate . convertAndSend ( STRING ) ; assertFalse ( org.springframework.integration.jdbc.MessagingTemplate . convertSendAndReceive ( STRING , java.lang.Boolean .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.jdbc.PollableChannel org.springframework.integration.jdbc.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ServiceActivator ( inputChannel = STRING ) public org.springframework.integration.jdbc.ExpressionControlBusFactoryBean org.springframework.integration.jdbc.ExpressionControlBusFactoryBean ( ) { return new ExpressionControlBusFactoryBean ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ InboundChannelAdapter ( value = STRING , poller = @ Poller ( fixedDelay = STRING ) ) public org.springframework.integration.jdbc.MessageSource<?> < ? > org.springframework.integration.jdbc.MessageSource<?> ( ) { StoredProcPollingChannelAdapter org.springframework.integration.jdbc.StoredProcPollingChannelAdapter = new StoredProcPollingChannelAdapter ( org.springframework.integration.jdbc.StoredProcExecutor ( ) ) ; org.springframework.integration.jdbc.StoredProcPollingChannelAdapter . setExpectSingleResult ( true ) ; return org.springframework.integration.jdbc.StoredProcPollingChannelAdapter ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.jdbc.StoredProcExecutor org.springframework.integration.jdbc.StoredProcExecutor ( ) { StoredProcExecutor org.springframework.integration.jdbc.StoredProcExecutor = new StoredProcExecutor ( javax.sql.DataSource ( ) ) ; org.springframework.integration.jdbc.StoredProcExecutor . setIgnoreColumnMetaData ( true ) ; org.springframework.integration.jdbc.StoredProcExecutor . setStoredProcedureName ( STRING ) ; java.util.List<org.springframework.integration.jdbc.ProcedureParameter> < ProcedureParameter > java.util.List<org.springframework.integration.jdbc.ProcedureParameter> = new java.util.ArrayList<org.springframework.integration.jdbc.ProcedureParameter> < ProcedureParameter > ( ) ; java.util.List<org.springframework.integration.jdbc.ProcedureParameter> . add ( new ProcedureParameter ( STRING , NUMBER , null ) ) ; java.util.List<org.springframework.integration.jdbc.ProcedureParameter> . add ( new ProcedureParameter ( STRING , NUMBER , null ) ) ; org.springframework.integration.jdbc.StoredProcExecutor . setProcedureParameters ( java.util.List<org.springframework.integration.jdbc.ProcedureParameter> ) ; java.util.List<org.springframework.integration.jdbc.SqlParameter> < SqlParameter > java.util.List<org.springframework.integration.jdbc.SqlParameter> = new java.util.ArrayList<org.springframework.integration.jdbc.SqlParameter> < SqlParameter > ( ) ; java.util.List<org.springframework.integration.jdbc.SqlParameter> . add ( new SqlParameter ( STRING , java.sql.Types . int ) ) ; java.util.List<org.springframework.integration.jdbc.SqlParameter> . add ( new SqlParameter ( STRING , java.sql.Types . int ) ) ; org.springframework.integration.jdbc.StoredProcExecutor . setSqlParameters ( java.util.List<org.springframework.integration.jdbc.SqlParameter> ) ; org.springframework.integration.jdbc.StoredProcExecutor . setReturningResultSetRowMappers ( java.util.Collections .< java.lang.String , RowMapper < ? > > java.util.Map<java.lang.String,org.springframework.integration.jdbc.RowMapper<?>> ( STRING , new PrimeMapper ( ) ) ) ; return org.springframework.integration.jdbc.StoredProcExecutor ; }  <METHOD_END>
<METHOD_START> @ Bean public javax.sql.DataSource javax.sql.DataSource ( ) { return new EmbeddedDatabaseBuilder ( ) . setType ( EmbeddedDatabaseType . H2 ) . addScript ( STRING ) . build ( ) ; }  <METHOD_END>
