<METHOD_START> public void ( SessionFactoryImplementor org.springframework.orm.hibernate5.SessionFactoryImplementor ) { super( org.springframework.orm.hibernate5.SessionFactoryImplementor ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected org.springframework.orm.hibernate5.Session org.springframework.orm.hibernate5.Session ( ) { Session org.springframework.orm.hibernate5.Session = super. buildOrObtainSession ( ) ; if ( TransactionSynchronizationManager . isCurrentTransactionReadOnly ( ) ) { org.springframework.orm.hibernate5.Session . setFlushMode ( FlushMode . MANUAL ) ; } return org.springframework.orm.hibernate5.Session ; }  <METHOD_END>
