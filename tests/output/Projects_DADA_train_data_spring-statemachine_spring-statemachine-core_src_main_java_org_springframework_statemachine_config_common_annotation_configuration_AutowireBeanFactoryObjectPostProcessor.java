<METHOD_START> public void ( AutowireCapableBeanFactory org.springframework.statemachine.config.common.annotation.configuration.AutowireCapableBeanFactory ) { Assert . notNull ( org.springframework.statemachine.config.common.annotation.configuration.AutowireCapableBeanFactory , STRING ) ; this . org.springframework.statemachine.config.common.annotation.configuration.AutowireCapableBeanFactory = org.springframework.statemachine.config.common.annotation.configuration.AutowireCapableBeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public < T > T T ( T T ) { T T = ( T ) org.springframework.statemachine.config.common.annotation.configuration.AutowireCapableBeanFactory . initializeBean ( T , null ) ; if( T instanceof DisposableBean ) { java.util.List<org.springframework.statemachine.config.common.annotation.configuration.DisposableBean> . add ( ( DisposableBean ) T ) ; } if( T instanceof Lifecycle ) { java.util.List<org.springframework.statemachine.config.common.annotation.configuration.Lifecycle> . add ( ( Lifecycle ) T ) ; } return T ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { for( DisposableBean org.springframework.statemachine.config.common.annotation.configuration.DisposableBean : java.util.List<org.springframework.statemachine.config.common.annotation.configuration.DisposableBean> ) { try { org.springframework.statemachine.config.common.annotation.configuration.DisposableBean . destroy ( ) ; } catch( java.lang.Exception java.lang.Exception ) { org.springframework.statemachine.config.common.annotation.configuration.Log . error ( java.lang.Exception ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { boolean = true ; for ( Lifecycle org.springframework.statemachine.config.common.annotation.configuration.Lifecycle : java.util.List<org.springframework.statemachine.config.common.annotation.configuration.Lifecycle> ) { org.springframework.statemachine.config.common.annotation.configuration.Lifecycle . start ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { for ( Lifecycle org.springframework.statemachine.config.common.annotation.configuration.Lifecycle : java.util.List<org.springframework.statemachine.config.common.annotation.configuration.Lifecycle> ) { org.springframework.statemachine.config.common.annotation.configuration.Lifecycle . stop ( ) ; } boolean = false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { void ( ) ; java.lang.Runnable . void ( ) ; }  <METHOD_END>
