<METHOD_START> public void void ( int int ) { synchronized ( this . java.lang.Object ) { this . int = int ; if ( this . java.util.concurrent.ThreadPoolExecutor != null ) { this . java.util.concurrent.ThreadPoolExecutor . void ( int ) ; } } }  <METHOD_END>
<METHOD_START> public int int ( ) { synchronized ( this . java.lang.Object ) { return this . int ; } }  <METHOD_END>
<METHOD_START> public void void ( int int ) { synchronized ( this . java.lang.Object ) { this . int = int ; if ( this . java.util.concurrent.ThreadPoolExecutor != null ) { this . java.util.concurrent.ThreadPoolExecutor . void ( int ) ; } } }  <METHOD_END>
<METHOD_START> public int int ( ) { synchronized ( this . java.lang.Object ) { return this . int ; } }  <METHOD_END>
<METHOD_START> public void void ( int int ) { synchronized ( this . java.lang.Object ) { this . int = int ; if ( this . java.util.concurrent.ThreadPoolExecutor != null ) { this . java.util.concurrent.ThreadPoolExecutor . void ( int , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; } } }  <METHOD_END>
<METHOD_START> public int int ( ) { synchronized ( this . java.lang.Object ) { return this . int ; } }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( TaskDecorator org.springframework.scheduling.concurrent.TaskDecorator ) { this . org.springframework.scheduling.concurrent.TaskDecorator = org.springframework.scheduling.concurrent.TaskDecorator ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService ( java.util.concurrent.ThreadFactory java.util.concurrent.ThreadFactory , java.util.concurrent.RejectedExecutionHandler java.util.concurrent.RejectedExecutionHandler ) { java.util.concurrent.BlockingQueue<java.lang.Runnable> < java.lang.Runnable > java.util.concurrent.BlockingQueue<java.lang.Runnable> = java.util.concurrent.BlockingQueue<java.lang.Runnable> ( this . int ) ; java.util.concurrent.ThreadPoolExecutor java.util.concurrent.ThreadPoolExecutor ; if ( this . org.springframework.scheduling.concurrent.TaskDecorator != null ) { java.util.concurrent.ThreadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor ( this . int , this . int , this . int , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit , java.util.concurrent.BlockingQueue<java.lang.Runnable> , java.util.concurrent.ThreadFactory , java.util.concurrent.RejectedExecutionHandler ) { @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { super. void ( org.springframework.scheduling.concurrent.TaskDecorator . decorate ( java.lang.Runnable ) ) ; } } ; } else { java.util.concurrent.ThreadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor ( this . int , this . int , this . int , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit , java.util.concurrent.BlockingQueue<java.lang.Runnable> , java.util.concurrent.ThreadFactory , java.util.concurrent.RejectedExecutionHandler ) ; } if ( this . boolean ) { java.util.concurrent.ThreadPoolExecutor . void ( true ) ; } this . java.util.concurrent.ThreadPoolExecutor = java.util.concurrent.ThreadPoolExecutor ; return java.util.concurrent.ThreadPoolExecutor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { super. void ( org.springframework.scheduling.concurrent.TaskDecorator . decorate ( java.lang.Runnable ) ) ; }  <METHOD_END>
<METHOD_START> protected java.util.concurrent.BlockingQueue<java.lang.Runnable> < java.lang.Runnable > java.util.concurrent.BlockingQueue<java.lang.Runnable> ( int int ) { if ( int > NUMBER ) { return new java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> <> ( int ) ; } else { return new java.util.concurrent.SynchronousQueue<java.lang.Runnable> <> ( ) ; } }  <METHOD_END>
<METHOD_START> public java.util.concurrent.ThreadPoolExecutor java.util.concurrent.ThreadPoolExecutor ( ) java.lang.IllegalStateException { Assert . state ( this . java.util.concurrent.ThreadPoolExecutor != null , STRING ) ; return this . java.util.concurrent.ThreadPoolExecutor ; }  <METHOD_END>
<METHOD_START> public int int ( ) { if ( this . java.util.concurrent.ThreadPoolExecutor == null ) { return this . int ; } return this . java.util.concurrent.ThreadPoolExecutor . int ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { if ( this . java.util.concurrent.ThreadPoolExecutor == null ) { return NUMBER ; } return this . java.util.concurrent.ThreadPoolExecutor . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { java.util.concurrent.Executor java.util.concurrent.Executor = java.util.concurrent.ThreadPoolExecutor ( ) ; try { java.util.concurrent.Executor . void ( java.lang.Runnable ) ; } catch ( java.util.concurrent.RejectedExecutionException java.util.concurrent.RejectedExecutionException ) { throw new TaskRejectedException ( STRING + java.util.concurrent.Executor + STRING + java.lang.Runnable , java.util.concurrent.RejectedExecutionException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable , long long ) { void ( java.lang.Runnable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.concurrent.Future<?> < ? > java.util.concurrent.Future<?> ( java.lang.Runnable java.lang.Runnable ) { java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.ThreadPoolExecutor ( ) ; try { return java.util.concurrent.ExecutorService . java.util.concurrent.Future<?> ( java.lang.Runnable ) ; } catch ( java.util.concurrent.RejectedExecutionException java.util.concurrent.RejectedExecutionException ) { throw new TaskRejectedException ( STRING + java.util.concurrent.ExecutorService + STRING + java.lang.Runnable , java.util.concurrent.RejectedExecutionException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.concurrent.Future<T> < T > java.util.concurrent.Future<T> ( java.util.concurrent.Callable<T> < T > java.util.concurrent.Callable<T> ) { java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.ThreadPoolExecutor ( ) ; try { return java.util.concurrent.ExecutorService . java.util.concurrent.Future<T> ( java.util.concurrent.Callable<T> ) ; } catch ( java.util.concurrent.RejectedExecutionException java.util.concurrent.RejectedExecutionException ) { throw new TaskRejectedException ( STRING + java.util.concurrent.ExecutorService + STRING + java.util.concurrent.Callable<T> , java.util.concurrent.RejectedExecutionException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.scheduling.concurrent.ListenableFuture<?> < ? > org.springframework.scheduling.concurrent.ListenableFuture<?> ( java.lang.Runnable java.lang.Runnable ) { java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.ThreadPoolExecutor ( ) ; try { ListenableFutureTask < java.lang.Object > org.springframework.scheduling.concurrent.ListenableFutureTask<java.lang.Object> = new ListenableFutureTask <> ( java.lang.Runnable , null ) ; java.util.concurrent.ExecutorService . void ( org.springframework.scheduling.concurrent.ListenableFutureTask<java.lang.Object> ) ; return org.springframework.scheduling.concurrent.ListenableFutureTask<java.lang.Object> ; } catch ( java.util.concurrent.RejectedExecutionException java.util.concurrent.RejectedExecutionException ) { throw new TaskRejectedException ( STRING + java.util.concurrent.ExecutorService + STRING + java.lang.Runnable , java.util.concurrent.RejectedExecutionException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > org.springframework.scheduling.concurrent.ListenableFuture<T> < T > org.springframework.scheduling.concurrent.ListenableFuture<T> ( java.util.concurrent.Callable<T> < T > java.util.concurrent.Callable<T> ) { java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.ThreadPoolExecutor ( ) ; try { ListenableFutureTask < T > org.springframework.scheduling.concurrent.ListenableFutureTask<T> = new ListenableFutureTask <> ( java.util.concurrent.Callable<T> ) ; java.util.concurrent.ExecutorService . void ( org.springframework.scheduling.concurrent.ListenableFutureTask<T> ) ; return org.springframework.scheduling.concurrent.ListenableFutureTask<T> ; } catch ( java.util.concurrent.RejectedExecutionException java.util.concurrent.RejectedExecutionException ) { throw new TaskRejectedException ( STRING + java.util.concurrent.ExecutorService + STRING + java.util.concurrent.Callable<T> , java.util.concurrent.RejectedExecutionException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
