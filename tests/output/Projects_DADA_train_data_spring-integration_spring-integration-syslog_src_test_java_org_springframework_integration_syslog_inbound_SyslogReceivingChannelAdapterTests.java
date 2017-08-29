<METHOD_START> @ Test public void void ( ) java.lang.Exception { SyslogReceivingChannelAdapterFactoryBean org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean = new SyslogReceivingChannelAdapterFactoryBean ( SyslogReceivingChannelAdapterFactoryBean . Protocol . udp ) ; int int = SocketUtils . findAvailableUdpSocket ( NUMBER ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setPort ( int ) ; PollableChannel org.springframework.integration.syslog.inbound.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setOutputChannel ( org.springframework.integration.syslog.inbound.PollableChannel ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . start ( ) ; UdpSyslogReceivingChannelAdapter org.springframework.integration.syslog.inbound.UdpSyslogReceivingChannelAdapter = ( UdpSyslogReceivingChannelAdapter ) org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . getObject ( ) ; java.lang.Thread . void ( NUMBER ) ; byte [] byte[] = STRING . byte[] ( STRING ) ; java.net.DatagramPacket java.net.DatagramPacket = new java.net.DatagramPacket ( byte[] , byte[] . int , new java.net.InetSocketAddress ( STRING , int ) ) ; java.net.DatagramSocket java.net.DatagramSocket = new java.net.DatagramSocket ( ) ; java.net.DatagramSocket . void ( java.net.DatagramPacket ) ; java.net.DatagramSocket . void ( ) ; Message < ? > org.springframework.integration.syslog.inbound.Message<?> = org.springframework.integration.syslog.inbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.syslog.inbound.Message<> ) ; assertEquals ( STRING , org.springframework.integration.syslog.inbound.Message<> . getHeaders ( ) . get ( STRING ) ) ; org.springframework.integration.syslog.inbound.UdpSyslogReceivingChannelAdapter . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SyslogReceivingChannelAdapterFactoryBean org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean = new SyslogReceivingChannelAdapterFactoryBean ( SyslogReceivingChannelAdapterFactoryBean . Protocol . tcp ) ; int int = SocketUtils . findAvailableServerSocket ( NUMBER ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setPort ( int ) ; PollableChannel org.springframework.integration.syslog.inbound.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setOutputChannel ( org.springframework.integration.syslog.inbound.PollableChannel ) ; ApplicationEventPublisher org.springframework.integration.syslog.inbound.ApplicationEventPublisher = mock ( ApplicationEventPublisher .class ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; doAnswer ( invocation -> { latch . countDown ( ) ; return null ; } ) . when ( org.springframework.integration.syslog.inbound.ApplicationEventPublisher ) . publishEvent ( any ( ApplicationEvent .class ) ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setApplicationEventPublisher ( org.springframework.integration.syslog.inbound.ApplicationEventPublisher ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . start ( ) ; TcpSyslogReceivingChannelAdapter org.springframework.integration.syslog.inbound.TcpSyslogReceivingChannelAdapter = ( TcpSyslogReceivingChannelAdapter ) org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . getObject ( ) ; Log org.springframework.integration.syslog.inbound.Log = spy ( TestUtils . getPropertyValue ( org.springframework.integration.syslog.inbound.TcpSyslogReceivingChannelAdapter , STRING , Log .class ) ) ; doReturn ( true ) . when ( org.springframework.integration.syslog.inbound.Log ) . isDebugEnabled ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; doAnswer ( invocation -> { if ( ( ( String ) invocation . getArgument ( NUMBER ) ) . contains ( STRING ) ) { sawLog . countDown ( ) ; } invocation . callRealMethod ( ) ; return null ; } ) . when ( org.springframework.integration.syslog.inbound.Log ) . debug ( anyString ( ) ) ; new DirectFieldAccessor ( org.springframework.integration.syslog.inbound.TcpSyslogReceivingChannelAdapter ) . setPropertyValue ( STRING , org.springframework.integration.syslog.inbound.Log ) ; java.lang.Thread . void ( NUMBER ) ; byte [] byte[] = STRING . byte[] ( STRING ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , int ) ; java.net.Socket . java.io.OutputStream ( ) . void ( byte[] ) ; java.net.Socket . void ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; Message < ? > org.springframework.integration.syslog.inbound.Message<?> = org.springframework.integration.syslog.inbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.syslog.inbound.Message<> ) ; assertEquals ( STRING , org.springframework.integration.syslog.inbound.Message<> . getHeaders ( ) . get ( STRING ) ) ; org.springframework.integration.syslog.inbound.TcpSyslogReceivingChannelAdapter . stop ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SyslogReceivingChannelAdapterFactoryBean org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean = new SyslogReceivingChannelAdapterFactoryBean ( SyslogReceivingChannelAdapterFactoryBean . Protocol . udp ) ; int int = SocketUtils . findAvailableUdpSocket ( NUMBER ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setPort ( int ) ; PollableChannel org.springframework.integration.syslog.inbound.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setOutputChannel ( org.springframework.integration.syslog.inbound.PollableChannel ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . start ( ) ; UdpSyslogReceivingChannelAdapter org.springframework.integration.syslog.inbound.UdpSyslogReceivingChannelAdapter = ( UdpSyslogReceivingChannelAdapter ) org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . getObject ( ) ; DefaultMessageConverter org.springframework.integration.syslog.inbound.DefaultMessageConverter = new DefaultMessageConverter ( ) ; org.springframework.integration.syslog.inbound.DefaultMessageConverter . setAsMap ( false ) ; org.springframework.integration.syslog.inbound.UdpSyslogReceivingChannelAdapter . setConverter ( org.springframework.integration.syslog.inbound.DefaultMessageConverter ) ; java.lang.Thread . void ( NUMBER ) ; byte [] byte[] = STRING . byte[] ( STRING ) ; java.net.DatagramPacket java.net.DatagramPacket = new java.net.DatagramPacket ( byte[] , byte[] . int , new java.net.InetSocketAddress ( STRING , int ) ) ; java.net.DatagramSocket java.net.DatagramSocket = new java.net.DatagramSocket ( ) ; java.net.DatagramSocket . void ( java.net.DatagramPacket ) ; java.net.DatagramSocket . void ( ) ; Message < ? > org.springframework.integration.syslog.inbound.Message<?> = org.springframework.integration.syslog.inbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.syslog.inbound.Message<> ) ; assertEquals ( STRING , org.springframework.integration.syslog.inbound.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , new java.lang.String ( ( byte [] ) org.springframework.integration.syslog.inbound.Message<> . getPayload ( ) , STRING ) ) ; org.springframework.integration.syslog.inbound.UdpSyslogReceivingChannelAdapter . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SyslogReceivingChannelAdapterFactoryBean org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean = new SyslogReceivingChannelAdapterFactoryBean ( SyslogReceivingChannelAdapterFactoryBean . Protocol . tcp ) ; int int = SocketUtils . findAvailableServerSocket ( NUMBER ) ; PollableChannel org.springframework.integration.syslog.inbound.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setOutputChannel ( org.springframework.integration.syslog.inbound.PollableChannel ) ; ApplicationEventPublisher org.springframework.integration.syslog.inbound.ApplicationEventPublisher = mock ( ApplicationEventPublisher .class ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; doAnswer ( invocation -> { latch . countDown ( ) ; return null ; } ) . when ( org.springframework.integration.syslog.inbound.ApplicationEventPublisher ) . publishEvent ( any ( ApplicationEvent .class ) ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; AbstractServerConnectionFactory org.springframework.integration.syslog.inbound.AbstractServerConnectionFactory = new TcpNioServerConnectionFactory ( int ) ; org.springframework.integration.syslog.inbound.AbstractServerConnectionFactory . setDeserializer ( new RFC6587SyslogDeserializer ( ) ) ; org.springframework.integration.syslog.inbound.AbstractServerConnectionFactory . setApplicationEventPublisher ( org.springframework.integration.syslog.inbound.ApplicationEventPublisher ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setConnectionFactory ( org.springframework.integration.syslog.inbound.AbstractServerConnectionFactory ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setConverter ( new RFC5424MessageConverter ( ) ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . start ( ) ; TcpSyslogReceivingChannelAdapter org.springframework.integration.syslog.inbound.TcpSyslogReceivingChannelAdapter = ( TcpSyslogReceivingChannelAdapter ) org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . getObject ( ) ; Log org.springframework.integration.syslog.inbound.Log = spy ( TestUtils . getPropertyValue ( org.springframework.integration.syslog.inbound.TcpSyslogReceivingChannelAdapter , STRING , Log .class ) ) ; doReturn ( true ) . when ( org.springframework.integration.syslog.inbound.Log ) . isDebugEnabled ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; doAnswer ( invocation -> { if ( ( ( String ) invocation . getArgument ( NUMBER ) ) . contains ( STRING ) ) { sawLog . countDown ( ) ; } invocation . callRealMethod ( ) ; return null ; } ) . when ( org.springframework.integration.syslog.inbound.Log ) . debug ( anyString ( ) ) ; new DirectFieldAccessor ( org.springframework.integration.syslog.inbound.TcpSyslogReceivingChannelAdapter ) . setPropertyValue ( STRING , org.springframework.integration.syslog.inbound.Log ) ; java.lang.Thread . void ( NUMBER ) ; byte [] byte[] = ( STRING + STRING + STRING ) . byte[] ( STRING ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , int ) ; java.net.Socket . java.io.OutputStream ( ) . void ( byte[] ) ; java.net.Socket . void ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.util.Map<java.lang.String,?> < java.lang.String , ? > > org.springframework.integration.syslog.inbound.Message<java.util.Map<java.lang.String,?>> = ( Message < java.util.Map<java.lang.String,?> < java.lang.String , ? > > ) org.springframework.integration.syslog.inbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.syslog.inbound.Message<java.util.Map<java.lang.String,?>> ) ; assertEquals ( STRING , org.springframework.integration.syslog.inbound.Message<java.util.Map<java.lang.String,?>> . getPayload ( ) . get ( STRING ) ) ; org.springframework.integration.syslog.inbound.TcpSyslogReceivingChannelAdapter . stop ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SyslogReceivingChannelAdapterFactoryBean org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean = new SyslogReceivingChannelAdapterFactoryBean ( SyslogReceivingChannelAdapterFactoryBean . Protocol . udp ) ; int int = SocketUtils . findAvailableUdpSocket ( NUMBER ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setPort ( int ) ; PollableChannel org.springframework.integration.syslog.inbound.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setOutputChannel ( org.springframework.integration.syslog.inbound.PollableChannel ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . setConverter ( new RFC5424MessageConverter ( ) ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . start ( ) ; UdpSyslogReceivingChannelAdapter org.springframework.integration.syslog.inbound.UdpSyslogReceivingChannelAdapter = ( UdpSyslogReceivingChannelAdapter ) org.springframework.integration.syslog.inbound.SyslogReceivingChannelAdapterFactoryBean . getObject ( ) ; java.lang.Thread . void ( NUMBER ) ; byte [] byte[] = ( STRING + STRING + STRING ) . byte[] ( STRING ) ; java.net.DatagramPacket java.net.DatagramPacket = new java.net.DatagramPacket ( byte[] , byte[] . int , new java.net.InetSocketAddress ( STRING , int ) ) ; java.net.DatagramSocket java.net.DatagramSocket = new java.net.DatagramSocket ( ) ; java.net.DatagramSocket . void ( java.net.DatagramPacket ) ; java.net.DatagramSocket . void ( ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.util.Map<java.lang.String,?> < java.lang.String , ? > > org.springframework.integration.syslog.inbound.Message<java.util.Map<java.lang.String,?>> = ( Message < java.util.Map<java.lang.String,?> < java.lang.String , ? > > ) org.springframework.integration.syslog.inbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.syslog.inbound.Message<java.util.Map<java.lang.String,?>> ) ; assertEquals ( STRING , org.springframework.integration.syslog.inbound.Message<java.util.Map<java.lang.String,?>> . getPayload ( ) . get ( STRING ) ) ; org.springframework.integration.syslog.inbound.UdpSyslogReceivingChannelAdapter . stop ( ) ; }  <METHOD_END>
