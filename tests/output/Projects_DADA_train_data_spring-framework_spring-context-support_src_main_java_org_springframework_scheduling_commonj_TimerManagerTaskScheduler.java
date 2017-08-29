<METHOD_START> public void void ( ErrorHandler org.springframework.scheduling.commonj.ErrorHandler ) { this . org.springframework.scheduling.commonj.ErrorHandler = org.springframework.scheduling.commonj.ErrorHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.concurrent.ScheduledFuture<?> < ? > java.util.concurrent.ScheduledFuture<?> ( java.lang.Runnable java.lang.Runnable , Trigger org.springframework.scheduling.commonj.Trigger ) { return new org.springframework.scheduling.commonj.TimerManagerTaskScheduler.ReschedulingTimerListener ( java.lang.Runnable ( java.lang.Runnable , true ) , org.springframework.scheduling.commonj.Trigger ) . java.util.concurrent.ScheduledFuture<?> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.concurrent.ScheduledFuture<?> < ? > java.util.concurrent.ScheduledFuture<?> ( java.lang.Runnable java.lang.Runnable , java.util.Date java.util.Date ) { org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture = new org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ( java.lang.Runnable ( java.lang.Runnable , false ) ) ; Timer org.springframework.scheduling.commonj.Timer = getTimerManager ( ) . schedule ( org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture , java.util.Date ) ; org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture . void ( org.springframework.scheduling.commonj.Timer ) ; return org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.concurrent.ScheduledFuture<?> < ? > java.util.concurrent.ScheduledFuture<?> ( java.lang.Runnable java.lang.Runnable , java.util.Date java.util.Date , long long ) { org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture = new org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ( java.lang.Runnable ( java.lang.Runnable , true ) ) ; Timer org.springframework.scheduling.commonj.Timer = getTimerManager ( ) . scheduleAtFixedRate ( org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture , java.util.Date , long ) ; org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture . void ( org.springframework.scheduling.commonj.Timer ) ; return org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.concurrent.ScheduledFuture<?> < ? > java.util.concurrent.ScheduledFuture<?> ( java.lang.Runnable java.lang.Runnable , long long ) { org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture = new org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ( java.lang.Runnable ( java.lang.Runnable , true ) ) ; Timer org.springframework.scheduling.commonj.Timer = getTimerManager ( ) . scheduleAtFixedRate ( org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture , NUMBER , long ) ; org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture . void ( org.springframework.scheduling.commonj.Timer ) ; return org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.concurrent.ScheduledFuture<?> < ? > java.util.concurrent.ScheduledFuture<?> ( java.lang.Runnable java.lang.Runnable , java.util.Date java.util.Date , long long ) { org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture = new org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ( java.lang.Runnable ( java.lang.Runnable , true ) ) ; Timer org.springframework.scheduling.commonj.Timer = getTimerManager ( ) . schedule ( org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture , java.util.Date , long ) ; org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture . void ( org.springframework.scheduling.commonj.Timer ) ; return org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.concurrent.ScheduledFuture<?> < ? > java.util.concurrent.ScheduledFuture<?> ( java.lang.Runnable java.lang.Runnable , long long ) { org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture = new org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ( java.lang.Runnable ( java.lang.Runnable , true ) ) ; Timer org.springframework.scheduling.commonj.Timer = getTimerManager ( ) . schedule ( org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture , NUMBER , long ) ; org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture . void ( org.springframework.scheduling.commonj.Timer ) ; return org.springframework.scheduling.commonj.TimerManagerTaskScheduler.TimerScheduledFuture ; }  <METHOD_END>
<METHOD_START> private java.lang.Runnable java.lang.Runnable ( java.lang.Runnable java.lang.Runnable , boolean boolean ) { return TaskUtils . decorateTaskWithErrorHandler ( java.lang.Runnable , this . org.springframework.scheduling.commonj.ErrorHandler , boolean ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Runnable java.lang.Runnable ) { super( java.lang.Runnable , null ); }  <METHOD_END>
<METHOD_START> public void void ( Timer org.springframework.scheduling.commonj.Timer ) { this . org.springframework.scheduling.commonj.Timer = org.springframework.scheduling.commonj.Timer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Timer org.springframework.scheduling.commonj.Timer ) { boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( boolean boolean ) { boolean boolean = super. boolean ( boolean ) ; this . org.springframework.scheduling.commonj.Timer . cancel ( ) ; this . boolean = true ; return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit ) { return java.util.concurrent.TimeUnit . long ( this . org.springframework.scheduling.commonj.Timer . getScheduledExecutionTime ( ) - java.lang.System . long ( ) , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.util.concurrent.Delayed java.util.concurrent.Delayed ) { if ( this == java.util.concurrent.Delayed ) { return NUMBER ; } long long = long ( java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) - java.util.concurrent.Delayed . long ( java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; return ( long == NUMBER ? NUMBER : ( ( long < NUMBER ) ? - NUMBER : NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Runnable java.lang.Runnable , Trigger org.springframework.scheduling.commonj.Trigger ) { super( java.lang.Runnable ); this . org.springframework.scheduling.commonj.Trigger = org.springframework.scheduling.commonj.Trigger ; }  <METHOD_END>
<METHOD_START> public java.util.concurrent.ScheduledFuture<?> < ? > java.util.concurrent.ScheduledFuture<?> ( ) { this . java.util.Date = this . org.springframework.scheduling.commonj.Trigger . nextExecutionTime ( this . org.springframework.scheduling.commonj.SimpleTriggerContext ) ; if ( this . java.util.Date == null ) { return null ; } void ( getTimerManager ( ) . schedule ( this , this . java.util.Date ) ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Timer org.springframework.scheduling.commonj.Timer ) { java.util.Date java.util.Date = new java.util.Date ( ) ; super. void ( org.springframework.scheduling.commonj.Timer ) ; java.util.Date java.util.Date = new java.util.Date ( ) ; this . org.springframework.scheduling.commonj.SimpleTriggerContext . update ( this . java.util.Date , java.util.Date , java.util.Date ) ; if ( ! this . boolean ) { java.util.concurrent.ScheduledFuture<?> ( ) ; } }  <METHOD_END>
