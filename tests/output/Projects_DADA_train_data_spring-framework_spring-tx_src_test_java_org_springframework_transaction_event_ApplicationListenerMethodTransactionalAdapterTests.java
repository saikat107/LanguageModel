<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.transaction.event.ApplicationListenerMethodTransactionalAdapterTests.SampleEvents .class , STRING , java.lang.String .class ) ; void ( java.lang.reflect.Method , TransactionPhase . AFTER_COMMIT ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.transaction.event.ApplicationListenerMethodTransactionalAdapterTests.SampleEvents .class , STRING , java.lang.String .class ) ; void ( java.lang.reflect.Method , TransactionPhase . AFTER_ROLLBACK ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.transaction.event.ApplicationListenerMethodTransactionalAdapterTests.SampleEvents .class , STRING ) ; void ( java.lang.reflect.Method , TransactionPhase . AFTER_COMPLETION ) ; void ( true , java.lang.reflect.Method , org.springframework.transaction.event.ResolvableType ( java.lang.String .class ) ) ; void ( true , java.lang.reflect.Method , org.springframework.transaction.event.ResolvableType ( java.lang.Integer .class ) ) ; void ( false , java.lang.reflect.Method , org.springframework.transaction.event.ResolvableType ( java.lang.Double .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.transaction.event.ApplicationListenerMethodTransactionalAdapterTests.SampleEvents .class , STRING ) ; void ( java.lang.reflect.Method , TransactionPhase . AFTER_COMMIT ) ; void ( true , java.lang.reflect.Method , org.springframework.transaction.event.ResolvableType ( java.lang.String .class ) ) ; void ( false , java.lang.reflect.Method , org.springframework.transaction.event.ResolvableType ( java.lang.Double .class ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.reflect.Method java.lang.reflect.Method , TransactionPhase org.springframework.transaction.event.TransactionPhase ) { assertNotNull ( STRING , java.lang.reflect.Method ) ; TransactionalEventListener org.springframework.transaction.event.TransactionalEventListener = AnnotatedElementUtils . findMergedAnnotation ( java.lang.reflect.Method , TransactionalEventListener .class ) ; assertEquals ( STRING + java.lang.reflect.Method + STRING , org.springframework.transaction.event.TransactionPhase , org.springframework.transaction.event.TransactionalEventListener . phase ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean , java.lang.reflect.Method java.lang.reflect.Method , ResolvableType org.springframework.transaction.event.ResolvableType ) { ApplicationListenerMethodAdapter org.springframework.transaction.event.ApplicationListenerMethodAdapter = org.springframework.transaction.event.ApplicationListenerMethodTransactionalAdapter ( java.lang.reflect.Method ) ; assertEquals ( STRING + org.springframework.transaction.event.ResolvableType + STRING + java.lang.reflect.Method , boolean , org.springframework.transaction.event.ApplicationListenerMethodAdapter . supportsEventType ( org.springframework.transaction.event.ResolvableType ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.transaction.event.ApplicationListenerMethodTransactionalAdapter org.springframework.transaction.event.ApplicationListenerMethodTransactionalAdapter ( java.lang.reflect.Method java.lang.reflect.Method ) { return new ApplicationListenerMethodTransactionalAdapter ( STRING , org.springframework.transaction.event.ApplicationListenerMethodTransactionalAdapterTests.SampleEvents .class , java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.transaction.event.ResolvableType org.springframework.transaction.event.ResolvableType ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ResolvableType . forClassWithGenerics ( PayloadApplicationEvent .class , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener public void void ( java.lang.String java.lang.String ) {		}  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = TransactionPhase . AFTER_ROLLBACK ) public void void ( java.lang.String java.lang.String ) {		}  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( classes = { java.lang.String .class , java.lang.Integer .class } , phase = TransactionPhase . AFTER_COMPLETION ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( java.lang.String .class ) public void void ( ) {		}  <METHOD_END>
