<METHOD_START> @ Bean public org.springframework.test.context.junit4.spr9645.PlatformTransactionManager org.springframework.test.context.junit4.spr9645.PlatformTransactionManager ( ) { return org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.test.context.junit4.spr9645.PlatformTransactionManager org.springframework.test.context.junit4.spr9645.PlatformTransactionManager ( ) { return org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager ; }  <METHOD_END>
<METHOD_START> @ BeforeTransaction public void void ( ) { org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . clear ( ) ; org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . clear ( ) ; }  <METHOD_END>
<METHOD_START> @ Transactional ( STRING ) @ Test public void void ( ) { assertEquals ( NUMBER , org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . begun ) ; assertEquals ( NUMBER , org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . inflight ) ; assertEquals ( NUMBER , org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . commits ) ; assertEquals ( NUMBER , org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . rollbacks ) ; }  <METHOD_END>
<METHOD_START> @ AfterTransaction public void void ( ) { assertEquals ( NUMBER , org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . begun ) ; assertEquals ( NUMBER , org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . inflight ) ; assertEquals ( NUMBER , org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . commits ) ; assertEquals ( NUMBER , org.springframework.test.context.junit4.spr9645.CallCountingTransactionManager . rollbacks ) ; }  <METHOD_END>
