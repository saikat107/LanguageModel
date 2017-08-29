<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.config.BeanFactory ) throws org.springframework.integration.config.BeansException { Assert . isInstanceOf ( ListableBeanFactory .class , org.springframework.integration.config.BeanFactory ) ; this . org.springframework.integration.config.ListableBeanFactory = ( ListableBeanFactory ) org.springframework.integration.config.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { java.util.Collection<org.springframework.integration.config.GlobalChannelInterceptorWrapper> < GlobalChannelInterceptorWrapper > java.util.Collection<org.springframework.integration.config.GlobalChannelInterceptorWrapper> = this . org.springframework.integration.config.ListableBeanFactory . getBeansOfType ( GlobalChannelInterceptorWrapper .class ) . values ( ) ; if ( CollectionUtils . isEmpty ( java.util.Collection<org.springframework.integration.config.GlobalChannelInterceptorWrapper> ) ) { org.springframework.integration.config.Log . debug ( STRING ) ; } else { for ( GlobalChannelInterceptorWrapper org.springframework.integration.config.GlobalChannelInterceptorWrapper : java.util.Collection<org.springframework.integration.config.GlobalChannelInterceptorWrapper> ) { if ( org.springframework.integration.config.GlobalChannelInterceptorWrapper . getOrder ( ) >= NUMBER ) { this . java.util.Set<org.springframework.integration.config.GlobalChannelInterceptorWrapper> . add ( org.springframework.integration.config.GlobalChannelInterceptorWrapper ) ; } else { this . java.util.Set<org.springframework.integration.config.GlobalChannelInterceptorWrapper> . add ( org.springframework.integration.config.GlobalChannelInterceptorWrapper ) ; } } java.util.Map<java.lang.String,org.springframework.integration.config.ChannelInterceptorAware> < java.lang.String , ChannelInterceptorAware > java.util.Map<java.lang.String,org.springframework.integration.config.ChannelInterceptorAware> = this . org.springframework.integration.config.ListableBeanFactory . getBeansOfType ( ChannelInterceptorAware .class ) ; for ( java.util.Map.Entry<java.lang.String,org.springframework.integration.config.ChannelInterceptorAware> < java.lang.String , ChannelInterceptorAware > java.util.Map.Entry<java.lang.String,org.springframework.integration.config.ChannelInterceptorAware> : java.util.Map<java.lang.String,org.springframework.integration.config.ChannelInterceptorAware> . entrySet ( ) ) { void ( java.util.Map.Entry<java.lang.String,org.springframework.integration.config.ChannelInterceptorAware> . getValue ( ) , java.util.Map.Entry<java.lang.String,org.springframework.integration.config.ChannelInterceptorAware> . getKey ( ) ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( ChannelInterceptorAware org.springframework.integration.config.ChannelInterceptorAware , java.lang.String java.lang.String ) { if ( org.springframework.integration.config.Log . isDebugEnabled ( ) ) { org.springframework.integration.config.Log . debug ( STRING + java.lang.String + STRING ) ; } java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> < GlobalChannelInterceptorWrapper > java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> = new java.util.ArrayList<org.springframework.integration.config.GlobalChannelInterceptorWrapper> < GlobalChannelInterceptorWrapper > ( ) ; for ( GlobalChannelInterceptorWrapper org.springframework.integration.config.GlobalChannelInterceptorWrapper : this . java.util.Set<org.springframework.integration.config.GlobalChannelInterceptorWrapper> ) { java.lang.String [] java.lang.String[] = org.springframework.integration.config.GlobalChannelInterceptorWrapper . getPatterns ( ) ; java.lang.String[] = StringUtils . trimArrayElements ( java.lang.String[] ) ; if ( PatternMatchUtils . simpleMatch ( java.lang.String[] , java.lang.String ) ) { java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> . add ( org.springframework.integration.config.GlobalChannelInterceptorWrapper ) ; } } java.util.Collections . void ( java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> , this . org.springframework.integration.config.OrderComparator ) ; for ( GlobalChannelInterceptorWrapper org.springframework.integration.config.GlobalChannelInterceptorWrapper : java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> ) { ChannelInterceptor org.springframework.integration.config.ChannelInterceptor = org.springframework.integration.config.GlobalChannelInterceptorWrapper . getChannelInterceptor ( ) ; if ( ! ( org.springframework.integration.config.ChannelInterceptor instanceof VetoCapableInterceptor ) || ( ( VetoCapableInterceptor ) org.springframework.integration.config.ChannelInterceptor ) . shouldIntercept ( java.lang.String , org.springframework.integration.config.ChannelInterceptorAware ) ) { org.springframework.integration.config.ChannelInterceptorAware . addInterceptor ( org.springframework.integration.config.ChannelInterceptor ) ; } } java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> . clear ( ) ; for ( GlobalChannelInterceptorWrapper org.springframework.integration.config.GlobalChannelInterceptorWrapper : this . java.util.Set<org.springframework.integration.config.GlobalChannelInterceptorWrapper> ) { java.lang.String [] java.lang.String[] = org.springframework.integration.config.GlobalChannelInterceptorWrapper . getPatterns ( ) ; java.lang.String[] = StringUtils . trimArrayElements ( java.lang.String[] ) ; if ( PatternMatchUtils . simpleMatch ( java.lang.String[] , java.lang.String ) ) { java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> . add ( org.springframework.integration.config.GlobalChannelInterceptorWrapper ) ; } } java.util.Collections . void ( java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> , this . org.springframework.integration.config.OrderComparator ) ; if ( ! java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> . isEmpty ( ) ) { for ( int int = java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> . size ( ) - NUMBER ; int >= NUMBER ; int -- ) { ChannelInterceptor org.springframework.integration.config.ChannelInterceptor = java.util.List<org.springframework.integration.config.GlobalChannelInterceptorWrapper> . get ( int ) . getChannelInterceptor ( ) ; if ( ! ( org.springframework.integration.config.ChannelInterceptor instanceof VetoCapableInterceptor ) || ( ( VetoCapableInterceptor ) org.springframework.integration.config.ChannelInterceptor ) . shouldIntercept ( java.lang.String , org.springframework.integration.config.ChannelInterceptorAware ) ) { org.springframework.integration.config.ChannelInterceptorAware . addInterceptor ( NUMBER , org.springframework.integration.config.ChannelInterceptor ) ; } } } }  <METHOD_END>
