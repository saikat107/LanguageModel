<METHOD_START> @ Test public void void ( ) { XAConnectionFactory org.springframework.boot.jta.atomikos.XAConnectionFactory = mock ( XAConnectionFactory .class ) ; AtomikosXAConnectionFactoryWrapper org.springframework.boot.jta.atomikos.AtomikosXAConnectionFactoryWrapper = new AtomikosXAConnectionFactoryWrapper ( ) ; ConnectionFactory org.springframework.boot.jta.atomikos.ConnectionFactory = org.springframework.boot.jta.atomikos.AtomikosXAConnectionFactoryWrapper . wrapConnectionFactory ( org.springframework.boot.jta.atomikos.XAConnectionFactory ) ; assertThat ( org.springframework.boot.jta.atomikos.ConnectionFactory ) . isInstanceOf ( AtomikosConnectionFactoryBean .class ) ; assertThat ( ( ( AtomikosConnectionFactoryBean ) org.springframework.boot.jta.atomikos.ConnectionFactory ) . getXaConnectionFactory ( ) ) . isSameAs ( org.springframework.boot.jta.atomikos.XAConnectionFactory ) ; }  <METHOD_END>
