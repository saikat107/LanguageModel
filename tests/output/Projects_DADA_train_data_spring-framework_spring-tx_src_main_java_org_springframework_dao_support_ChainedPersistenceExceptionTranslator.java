<METHOD_START> public final void void ( PersistenceExceptionTranslator org.springframework.dao.support.PersistenceExceptionTranslator ) { Assert . notNull ( org.springframework.dao.support.PersistenceExceptionTranslator , STRING ) ; this . java.util.List<org.springframework.dao.support.PersistenceExceptionTranslator> . add ( org.springframework.dao.support.PersistenceExceptionTranslator ) ; }  <METHOD_END>
<METHOD_START> public final org.springframework.dao.support.PersistenceExceptionTranslator [] org.springframework.dao.support.PersistenceExceptionTranslator[] ( ) { return this . java.util.List<org.springframework.dao.support.PersistenceExceptionTranslator> . toArray ( new PersistenceExceptionTranslator [ this . java.util.List<org.springframework.dao.support.PersistenceExceptionTranslator> . size ( ) ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.dao.support.DataAccessException org.springframework.dao.support.DataAccessException ( java.lang.RuntimeException java.lang.RuntimeException ) { for ( PersistenceExceptionTranslator org.springframework.dao.support.PersistenceExceptionTranslator : this . java.util.List<org.springframework.dao.support.PersistenceExceptionTranslator> ) { DataAccessException org.springframework.dao.support.DataAccessException = org.springframework.dao.support.PersistenceExceptionTranslator . translateExceptionIfPossible ( java.lang.RuntimeException ) ; if ( org.springframework.dao.support.DataAccessException != null ) { return org.springframework.dao.support.DataAccessException ; } } return null ; }  <METHOD_END>