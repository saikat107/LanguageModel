<METHOD_START> @ Test public void void ( ) { javax.sql.DataSource javax.sql.DataSource = this . org.springframework.boot.jta.narayana.NarayanaXADataSourceWrapper . wrapDataSource ( this . javax.sql.XADataSource ) ; assertThat ( javax.sql.DataSource ) . isInstanceOf ( NarayanaDataSourceBean .class ) ; verify ( this . org.springframework.boot.jta.narayana.NarayanaRecoveryManagerBean , times ( NUMBER ) ) . registerXAResourceRecoveryHelper ( any ( DataSourceXAResourceRecoveryHelper .class ) ) ; verify ( this . org.springframework.boot.jta.narayana.NarayanaProperties , times ( NUMBER ) ) . getRecoveryDbUser ( ) ; verify ( this . org.springframework.boot.jta.narayana.NarayanaProperties , times ( NUMBER ) ) . getRecoveryDbPass ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { given ( this . org.springframework.boot.jta.narayana.NarayanaProperties . getRecoveryDbUser ( ) ) . willReturn ( STRING ) ; given ( this . org.springframework.boot.jta.narayana.NarayanaProperties . getRecoveryDbPass ( ) ) . willReturn ( STRING ) ; javax.sql.DataSource javax.sql.DataSource = this . org.springframework.boot.jta.narayana.NarayanaXADataSourceWrapper . wrapDataSource ( this . javax.sql.XADataSource ) ; assertThat ( javax.sql.DataSource ) . isInstanceOf ( NarayanaDataSourceBean .class ) ; verify ( this . org.springframework.boot.jta.narayana.NarayanaRecoveryManagerBean , times ( NUMBER ) ) . registerXAResourceRecoveryHelper ( any ( DataSourceXAResourceRecoveryHelper .class ) ) ; verify ( this . org.springframework.boot.jta.narayana.NarayanaProperties , times ( NUMBER ) ) . getRecoveryDbUser ( ) ; verify ( this . org.springframework.boot.jta.narayana.NarayanaProperties , times ( NUMBER ) ) . getRecoveryDbPass ( ) ; }  <METHOD_END>
