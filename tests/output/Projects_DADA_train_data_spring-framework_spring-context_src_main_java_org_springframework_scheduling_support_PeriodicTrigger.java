<METHOD_START> public void ( long long ) { this( long , null ); }  <METHOD_END>
<METHOD_START> public void ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit ) { Assert . isTrue ( long >= NUMBER , STRING ) ; this . java.util.concurrent.TimeUnit = ( java.util.concurrent.TimeUnit != null ? java.util.concurrent.TimeUnit : java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; this . long = this . java.util.concurrent.TimeUnit . long ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = this . java.util.concurrent.TimeUnit . long ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( TriggerContext org.springframework.scheduling.support.TriggerContext ) { if ( org.springframework.scheduling.support.TriggerContext . lastScheduledExecutionTime ( ) == null ) { return new java.util.Date ( java.lang.System . long ( ) + this . long ) ; } else if ( this . boolean ) { return new java.util.Date ( org.springframework.scheduling.support.TriggerContext . lastScheduledExecutionTime ( ) . getTime ( ) + this . long ) ; } return new java.util.Date ( org.springframework.scheduling.support.TriggerContext . lastCompletionTime ( ) . getTime ( ) + this . long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.scheduling.support.PeriodicTrigger ) ) { return false ; } org.springframework.scheduling.support.PeriodicTrigger org.springframework.scheduling.support.PeriodicTrigger = ( org.springframework.scheduling.support.PeriodicTrigger ) java.lang.Object ; return ( this . boolean == org.springframework.scheduling.support.PeriodicTrigger . boolean && this . long == org.springframework.scheduling.support.PeriodicTrigger . long && this . long == org.springframework.scheduling.support.PeriodicTrigger . long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return ( this . boolean ? NUMBER : NUMBER ) + ( int ) ( NUMBER * this . long ) + ( int ) ( NUMBER * this . long ) ; }  <METHOD_END>
