<METHOD_START> void ( TestContext org.springframework.test.context.transaction.TestContext , PlatformTransactionManager org.springframework.test.context.transaction.PlatformTransactionManager , TransactionDefinition org.springframework.test.context.transaction.TransactionDefinition , boolean boolean ) { this . org.springframework.test.context.transaction.TestContext = org.springframework.test.context.transaction.TestContext ; this . org.springframework.test.context.transaction.PlatformTransactionManager = org.springframework.test.context.transaction.PlatformTransactionManager ; this . org.springframework.test.context.transaction.TransactionDefinition = org.springframework.test.context.transaction.TransactionDefinition ; this . boolean = boolean ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> org.springframework.test.context.transaction.TransactionStatus org.springframework.test.context.transaction.TransactionStatus ( ) { return this . org.springframework.test.context.transaction.TransactionStatus ; }  <METHOD_END>
<METHOD_START> boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> void void ( boolean boolean ) { Assert . state ( this . org.springframework.test.context.transaction.TransactionStatus != null , ( ) String . format ( STRING , this . testContext ) ) ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> void void ( ) { Assert . state ( this . org.springframework.test.context.transaction.TransactionStatus == null , STRING ) ; this . boolean = this . boolean ; this . org.springframework.test.context.transaction.TransactionStatus = this . org.springframework.test.context.transaction.PlatformTransactionManager . getTransaction ( this . org.springframework.test.context.transaction.TransactionDefinition ) ; ++ this . int ; if ( org.springframework.test.context.transaction.Log . isInfoEnabled ( ) ) { org.springframework.test.context.transaction.Log . info ( java.lang.String . java.lang.String ( STRING , this . int , this . org.springframework.test.context.transaction.TestContext , this . org.springframework.test.context.transaction.PlatformTransactionManager , boolean ) ) ; } }  <METHOD_END>
<METHOD_START> void void ( ) { if ( org.springframework.test.context.transaction.Log . isTraceEnabled ( ) ) { org.springframework.test.context.transaction.Log . trace ( java.lang.String . java.lang.String ( STRING , this . org.springframework.test.context.transaction.TestContext , this . org.springframework.test.context.transaction.TransactionStatus , boolean ) ) ; } Assert . state ( this . org.springframework.test.context.transaction.TransactionStatus != null , ( ) String . format ( STRING , this . testContext ) ) ; try { if ( boolean ) { this . org.springframework.test.context.transaction.PlatformTransactionManager . rollback ( this . org.springframework.test.context.transaction.TransactionStatus ) ; } else { this . org.springframework.test.context.transaction.PlatformTransactionManager . commit ( this . org.springframework.test.context.transaction.TransactionStatus ) ; } } finally { this . org.springframework.test.context.transaction.TransactionStatus = null ; } if ( org.springframework.test.context.transaction.Log . isInfoEnabled ( ) ) { org.springframework.test.context.transaction.Log . info ( java.lang.String . java.lang.String ( STRING , ( boolean ? STRING : STRING ) , this . org.springframework.test.context.transaction.TestContext ) ) ; } }  <METHOD_END>