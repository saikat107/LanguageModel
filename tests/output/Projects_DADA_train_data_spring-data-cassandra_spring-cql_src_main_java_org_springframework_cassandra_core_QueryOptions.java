<METHOD_START> public void ( ) {}  <METHOD_END>
<METHOD_START> public void ( ConsistencyLevel org.springframework.cassandra.core.ConsistencyLevel , RetryPolicy org.springframework.cassandra.core.RetryPolicy ) { void ( org.springframework.cassandra.core.ConsistencyLevel ) ; void ( org.springframework.cassandra.core.RetryPolicy ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( ) { return new org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public org.springframework.cassandra.core.ConsistencyLevel org.springframework.cassandra.core.ConsistencyLevel ( ) { return org.springframework.cassandra.core.ConsistencyLevel ; }  <METHOD_END>
<METHOD_START> public void void ( ConsistencyLevel org.springframework.cassandra.core.ConsistencyLevel ) { if ( this . com.datastax.driver.core.ConsistencyLevel != null && org.springframework.cassandra.core.ConsistencyLevel != null ) { throw new java.lang.IllegalStateException ( STRING ) ; } this . org.springframework.cassandra.core.ConsistencyLevel = org.springframework.cassandra.core.ConsistencyLevel ; }  <METHOD_END>
<METHOD_START> public void void ( com . com.datastax . com.datastax . com.datastax . com.datastax com.datastax.driver.core.ConsistencyLevel ) { if ( this . org.springframework.cassandra.core.ConsistencyLevel != null && com.datastax.driver.core.ConsistencyLevel != null ) { throw new java.lang.IllegalStateException ( STRING ) ; } this . com.datastax.driver.core.ConsistencyLevel = com.datastax.driver.core.ConsistencyLevel ; }  <METHOD_END>
<METHOD_START> protected com . com.datastax . com.datastax . com.datastax . com.datastax.driver.core.ConsistencyLevel com.datastax.driver.core.ConsistencyLevel ( ) { return com.datastax.driver.core.ConsistencyLevel ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.RetryPolicy org.springframework.cassandra.core.RetryPolicy ( ) { return org.springframework.cassandra.core.RetryPolicy ; }  <METHOD_END>
<METHOD_START> public void void ( RetryPolicy org.springframework.cassandra.core.RetryPolicy ) { if ( this . com.datastax.driver.core.policies.RetryPolicy != null && org.springframework.cassandra.core.RetryPolicy != null ) { throw new java.lang.IllegalStateException ( STRING ) ; } this . org.springframework.cassandra.core.RetryPolicy = org.springframework.cassandra.core.RetryPolicy ; }  <METHOD_END>
<METHOD_START> public void void ( com . com.datastax . com.datastax . com.datastax . com.datastax . com.datastax com.datastax.driver.core.policies.RetryPolicy ) { if ( this . org.springframework.cassandra.core.RetryPolicy != null && com.datastax.driver.core.policies.RetryPolicy != null ) { throw new java.lang.IllegalStateException ( STRING ) ; } this . com.datastax.driver.core.policies.RetryPolicy = com.datastax.driver.core.policies.RetryPolicy ; }  <METHOD_END>
<METHOD_START> protected com . com.datastax . com.datastax . com.datastax . com.datastax . com.datastax.driver.core.policies.RetryPolicy com.datastax.driver.core.policies.RetryPolicy ( ) { return com.datastax.driver.core.policies.RetryPolicy ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { Assert . isTrue ( int >= NUMBER , STRING ) ; this . java.lang.Integer = int ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( ) { return java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { Assert . isTrue ( long >= NUMBER , STRING ) ; this . java.lang.Long = long ; }  <METHOD_END>
<METHOD_START> protected java.lang.Long java.lang.Long ( ) { return java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . java.lang.Boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected java.lang.Boolean java.lang.Boolean ( ) { return java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> void ( ) {}  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( com . com.datastax . com.datastax . com.datastax . com.datastax com.datastax.driver.core.ConsistencyLevel ) { Assert . notNull ( com.datastax.driver.core.ConsistencyLevel , STRING ) ; this . com.datastax.driver.core.ConsistencyLevel = com.datastax.driver.core.ConsistencyLevel ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( RetryPolicy org.springframework.cassandra.core.RetryPolicy ) { Assert . notNull ( org.springframework.cassandra.core.RetryPolicy , STRING ) ; Assert . state ( this . com.datastax.driver.core.policies.RetryPolicy == null , STRING ) ; this . org.springframework.cassandra.core.RetryPolicy = org.springframework.cassandra.core.RetryPolicy ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( com . com.datastax . com.datastax . com.datastax . com.datastax . com.datastax com.datastax.driver.core.policies.RetryPolicy ) { Assert . notNull ( com.datastax.driver.core.policies.RetryPolicy , STRING ) ; Assert . state ( this . org.springframework.cassandra.core.RetryPolicy == null , STRING ) ; this . com.datastax.driver.core.policies.RetryPolicy = com.datastax.driver.core.policies.RetryPolicy ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( int int ) { Assert . isTrue ( int >= NUMBER , STRING ) ; this . java.lang.Integer = int ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( long long ) { Assert . isTrue ( long >= NUMBER , STRING ) ; this . java.lang.Long = long ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit ) { Assert . isTrue ( long >= NUMBER , STRING ) ; Assert . notNull ( java.util.concurrent.TimeUnit , STRING ) ; this . java.lang.Long = java.util.concurrent.TimeUnit . long ( long ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( boolean boolean ) { this . java.lang.Boolean = boolean ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( ) { return org.springframework.cassandra.core.QueryOptions.QueryOptionsBuilder ( true ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.core.QueryOptions org.springframework.cassandra.core.QueryOptions ( ) { return org.springframework.cassandra.core.QueryOptions ( new org.springframework.cassandra.core.QueryOptions ( ) ) ; }  <METHOD_END>
<METHOD_START> < T extends org.springframework.cassandra.core.QueryOptions > T T ( T T ) { T . void ( com.datastax.driver.core.ConsistencyLevel ) ; T . void ( org.springframework.cassandra.core.RetryPolicy ) ; T . void ( com.datastax.driver.core.policies.RetryPolicy ) ; if ( java.lang.Integer != null ) { T . void ( java.lang.Integer ) ; } if ( java.lang.Long != null ) { T . void ( java.lang.Long ) ; } if ( java.lang.Boolean != null ) { T . void ( java.lang.Boolean ) ; } return T ; }  <METHOD_END>
