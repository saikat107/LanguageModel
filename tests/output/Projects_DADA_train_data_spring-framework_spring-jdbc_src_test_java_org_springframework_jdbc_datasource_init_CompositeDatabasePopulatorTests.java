<METHOD_START> @ Test public void void ( ) java.sql.SQLException { CompositeDatabasePopulator org.springframework.jdbc.datasource.init.CompositeDatabasePopulator = new CompositeDatabasePopulator ( ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . addPopulators ( org.springframework.jdbc.datasource.init.DatabasePopulator , org.springframework.jdbc.datasource.init.DatabasePopulator ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { CompositeDatabasePopulator org.springframework.jdbc.datasource.init.CompositeDatabasePopulator = new CompositeDatabasePopulator ( ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . setPopulators ( org.springframework.jdbc.datasource.init.DatabasePopulator , org.springframework.jdbc.datasource.init.DatabasePopulator ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { CompositeDatabasePopulator org.springframework.jdbc.datasource.init.CompositeDatabasePopulator = new CompositeDatabasePopulator ( ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . setPopulators ( org.springframework.jdbc.datasource.init.DatabasePopulator ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . setPopulators ( org.springframework.jdbc.datasource.init.DatabasePopulator ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { CompositeDatabasePopulator org.springframework.jdbc.datasource.init.CompositeDatabasePopulator = new CompositeDatabasePopulator ( org.springframework.jdbc.datasource.init.DatabasePopulator , org.springframework.jdbc.datasource.init.DatabasePopulator ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java.util.Set<org.springframework.jdbc.datasource.init.DatabasePopulator> < DatabasePopulator > java.util.Set<org.springframework.jdbc.datasource.init.DatabasePopulator> = new java.util.LinkedHashSet<org.springframework.jdbc.datasource.init.DatabasePopulator> <> ( ) ; java.util.Set<org.springframework.jdbc.datasource.init.DatabasePopulator> . add ( org.springframework.jdbc.datasource.init.DatabasePopulator ) ; java.util.Set<org.springframework.jdbc.datasource.init.DatabasePopulator> . add ( org.springframework.jdbc.datasource.init.DatabasePopulator ) ; CompositeDatabasePopulator org.springframework.jdbc.datasource.init.CompositeDatabasePopulator = new CompositeDatabasePopulator ( java.util.Set<org.springframework.jdbc.datasource.init.DatabasePopulator> ) ; org.springframework.jdbc.datasource.init.CompositeDatabasePopulator . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; verify ( org.springframework.jdbc.datasource.init.DatabasePopulator , times ( NUMBER ) ) . populate ( java.sql.Connection ) ; }  <METHOD_END>
