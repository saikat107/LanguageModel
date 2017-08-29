<METHOD_START> public void void ( WorkManager org.springframework.scheduling.commonj.WorkManager ) { this . org.springframework.scheduling.commonj.WorkManager = org.springframework.scheduling.commonj.WorkManager ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( WorkListener org.springframework.scheduling.commonj.WorkListener ) { this . org.springframework.scheduling.commonj.WorkListener = org.springframework.scheduling.commonj.WorkListener ; }  <METHOD_END>
<METHOD_START> public void void ( TaskDecorator org.springframework.scheduling.commonj.TaskDecorator ) { this . org.springframework.scheduling.commonj.TaskDecorator = org.springframework.scheduling.commonj.TaskDecorator ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) javax.naming.NamingException { if ( this . org.springframework.scheduling.commonj.WorkManager == null ) { if ( this . java.lang.String == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } this . org.springframework.scheduling.commonj.WorkManager = lookup ( this . java.lang.String , WorkManager .class ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { Assert . state ( this . org.springframework.scheduling.commonj.WorkManager != null , STRING ) ; Work org.springframework.scheduling.commonj.Work = new DelegatingWork ( this . org.springframework.scheduling.commonj.TaskDecorator != null ? this . org.springframework.scheduling.commonj.TaskDecorator . decorate ( java.lang.Runnable ) : java.lang.Runnable ) ; try { if ( this . org.springframework.scheduling.commonj.WorkListener != null ) { this . org.springframework.scheduling.commonj.WorkManager . schedule ( org.springframework.scheduling.commonj.Work , this . org.springframework.scheduling.commonj.WorkListener ) ; } else { this . org.springframework.scheduling.commonj.WorkManager . schedule ( org.springframework.scheduling.commonj.Work ) ; } } catch ( WorkRejectedException org.springframework.scheduling.commonj.WorkRejectedException ) { throw new TaskRejectedException ( STRING + java.lang.Runnable , org.springframework.scheduling.commonj.WorkRejectedException ) ; } catch ( WorkException org.springframework.scheduling.commonj.WorkException ) { throw new SchedulingException ( STRING , org.springframework.scheduling.commonj.WorkException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable , long long ) { void ( java.lang.Runnable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.concurrent.Future<?> < ? > java.util.concurrent.Future<?> ( java.lang.Runnable java.lang.Runnable ) { java.util.concurrent.FutureTask<java.lang.Object> < java.lang.Object > java.util.concurrent.FutureTask<java.lang.Object> = new java.util.concurrent.FutureTask<java.lang.Object> <> ( java.lang.Runnable , null ) ; void ( java.util.concurrent.FutureTask<java.lang.Object> ) ; return java.util.concurrent.FutureTask<java.lang.Object> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.concurrent.Future<T> < T > java.util.concurrent.Future<T> ( java.util.concurrent.Callable<T> < T > java.util.concurrent.Callable<T> ) { java.util.concurrent.FutureTask<T> < T > java.util.concurrent.FutureTask<T> = new java.util.concurrent.FutureTask<T> <> ( java.util.concurrent.Callable<T> ) ; void ( java.util.concurrent.FutureTask<T> ) ; return java.util.concurrent.FutureTask<T> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.scheduling.commonj.ListenableFuture<?> < ? > org.springframework.scheduling.commonj.ListenableFuture<?> ( java.lang.Runnable java.lang.Runnable ) { ListenableFutureTask < java.lang.Object > org.springframework.scheduling.commonj.ListenableFutureTask<java.lang.Object> = new ListenableFutureTask <> ( java.lang.Runnable , null ) ; void ( org.springframework.scheduling.commonj.ListenableFutureTask<java.lang.Object> ) ; return org.springframework.scheduling.commonj.ListenableFutureTask<java.lang.Object> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > org.springframework.scheduling.commonj.ListenableFuture<T> < T > org.springframework.scheduling.commonj.ListenableFuture<T> ( java.util.concurrent.Callable<T> < T > java.util.concurrent.Callable<T> ) { ListenableFutureTask < T > org.springframework.scheduling.commonj.ListenableFutureTask<T> = new ListenableFutureTask <> ( java.util.concurrent.Callable<T> ) ; void ( org.springframework.scheduling.commonj.ListenableFutureTask<T> ) ; return org.springframework.scheduling.commonj.ListenableFutureTask<T> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.scheduling.commonj.WorkItem org.springframework.scheduling.commonj.WorkItem ( Work org.springframework.scheduling.commonj.Work ) throws org.springframework.scheduling.commonj.WorkException , java.lang.IllegalArgumentException { return this . org.springframework.scheduling.commonj.WorkManager . schedule ( org.springframework.scheduling.commonj.Work ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.scheduling.commonj.WorkItem org.springframework.scheduling.commonj.WorkItem ( Work org.springframework.scheduling.commonj.Work , WorkListener org.springframework.scheduling.commonj.WorkListener ) throws org.springframework.scheduling.commonj.WorkException { return this . org.springframework.scheduling.commonj.WorkManager . schedule ( org.springframework.scheduling.commonj.Work , org.springframework.scheduling.commonj.WorkListener ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public boolean boolean ( java.util.Collection java.util.Collection , long long ) throws java.lang.InterruptedException { return this . org.springframework.scheduling.commonj.WorkManager . waitForAll ( java.util.Collection , long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public java.util.Collection java.util.Collection ( java.util.Collection java.util.Collection , long long ) throws java.lang.InterruptedException { return this . org.springframework.scheduling.commonj.WorkManager . waitForAny ( java.util.Collection , long ) ; }  <METHOD_END>