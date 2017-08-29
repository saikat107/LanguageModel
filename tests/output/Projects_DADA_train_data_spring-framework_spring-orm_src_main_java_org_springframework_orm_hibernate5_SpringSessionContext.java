<METHOD_START> public void ( SessionFactoryImplementor org.springframework.orm.hibernate5.SessionFactoryImplementor ) { this . org.springframework.orm.hibernate5.SessionFactoryImplementor = org.springframework.orm.hibernate5.SessionFactoryImplementor ; try { JtaPlatform org.springframework.orm.hibernate5.JtaPlatform = org.springframework.orm.hibernate5.SessionFactoryImplementor . getServiceRegistry ( ) . getService ( JtaPlatform .class ) ; this . org.springframework.orm.hibernate5.TransactionManager = org.springframework.orm.hibernate5.JtaPlatform . retrieveTransactionManager ( ) ; if ( this . org.springframework.orm.hibernate5.TransactionManager != null ) { this . org.springframework.orm.hibernate5.CurrentSessionContext = new SpringJtaSessionContext ( org.springframework.orm.hibernate5.SessionFactoryImplementor ) ; } } catch ( java.lang.Exception java.lang.Exception ) { LogFactory . getLog ( org.springframework.orm.hibernate5.SpringSessionContext .class ) . warn ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.orm.hibernate5.Session org.springframework.orm.hibernate5.Session ( ) org.springframework.orm.hibernate5.HibernateException { java.lang.Object java.lang.Object = TransactionSynchronizationManager . getResource ( this . org.springframework.orm.hibernate5.SessionFactoryImplementor ) ; if ( java.lang.Object instanceof Session ) { return ( Session ) java.lang.Object ; } else if ( java.lang.Object instanceof SessionHolder ) { SessionHolder org.springframework.orm.hibernate5.SessionHolder = ( SessionHolder ) java.lang.Object ; Session org.springframework.orm.hibernate5.Session = org.springframework.orm.hibernate5.SessionHolder . getSession ( ) ; if ( ! org.springframework.orm.hibernate5.SessionHolder . isSynchronizedWithTransaction ( ) && TransactionSynchronizationManager . isSynchronizationActive ( ) ) { TransactionSynchronizationManager . registerSynchronization ( new SpringSessionSynchronization ( org.springframework.orm.hibernate5.SessionHolder , this . org.springframework.orm.hibernate5.SessionFactoryImplementor , false ) ) ; org.springframework.orm.hibernate5.SessionHolder . setSynchronizedWithTransaction ( true ) ; FlushMode org.springframework.orm.hibernate5.FlushMode = SessionFactoryUtils . getFlushMode ( org.springframework.orm.hibernate5.Session ) ; if ( org.springframework.orm.hibernate5.FlushMode . equals ( FlushMode . MANUAL ) && ! TransactionSynchronizationManager . isCurrentTransactionReadOnly ( ) ) { org.springframework.orm.hibernate5.Session . setFlushMode ( FlushMode . AUTO ) ; org.springframework.orm.hibernate5.SessionHolder . setPreviousFlushMode ( org.springframework.orm.hibernate5.FlushMode ) ; } } return org.springframework.orm.hibernate5.Session ; } if ( this . org.springframework.orm.hibernate5.TransactionManager != null ) { try { if ( this . org.springframework.orm.hibernate5.TransactionManager . getStatus ( ) == Status . STATUS_ACTIVE ) { Session org.springframework.orm.hibernate5.Session = this . org.springframework.orm.hibernate5.CurrentSessionContext . currentSession ( ) ; if ( TransactionSynchronizationManager . isSynchronizationActive ( ) ) { TransactionSynchronizationManager . registerSynchronization ( new SpringFlushSynchronization ( org.springframework.orm.hibernate5.Session ) ) ; } return org.springframework.orm.hibernate5.Session ; } } catch ( SystemException org.springframework.orm.hibernate5.SystemException ) { throw new HibernateException ( STRING , org.springframework.orm.hibernate5.SystemException ) ; } } if ( TransactionSynchronizationManager . isSynchronizationActive ( ) ) { Session org.springframework.orm.hibernate5.Session = this . org.springframework.orm.hibernate5.SessionFactoryImplementor . openSession ( ) ; if ( TransactionSynchronizationManager . isCurrentTransactionReadOnly ( ) ) { org.springframework.orm.hibernate5.Session . setFlushMode ( FlushMode . MANUAL ) ; } SessionHolder org.springframework.orm.hibernate5.SessionHolder = new SessionHolder ( org.springframework.orm.hibernate5.Session ) ; TransactionSynchronizationManager . registerSynchronization ( new SpringSessionSynchronization ( org.springframework.orm.hibernate5.SessionHolder , this . org.springframework.orm.hibernate5.SessionFactoryImplementor , true ) ) ; TransactionSynchronizationManager . bindResource ( this . org.springframework.orm.hibernate5.SessionFactoryImplementor , org.springframework.orm.hibernate5.SessionHolder ) ; org.springframework.orm.hibernate5.SessionHolder . setSynchronizedWithTransaction ( true ) ; return org.springframework.orm.hibernate5.Session ; } else { throw new HibernateException ( STRING ) ; } }  <METHOD_END>
