<METHOD_START> @ Before public void void ( ) { assumeTrue ( currentEntityManagerIsAJpa21EntityManager ( org.springframework.data.jpa.repository.EntityManager ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.jpa.repository.DummyRepository . adHocProcedureWithNoInputAnd1OutputParameter ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.jpa.repository.DummyRepository . adHocProcedureWith1InputAnd1OutputParameter ( NUMBER ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.DummyRepository . adHocProcedureWith1InputAndNoOutputParameter ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore ( java.lang.String ) public void void ( ) { java.util.List<org.springframework.data.jpa.repository.Dummy> < Dummy > java.util.List<org.springframework.data.jpa.repository.Dummy> = org.springframework.data.jpa.repository.DummyRepository . adHocProcedureWith1InputAnd1OutputParameterWithResultSet ( STRING ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.Dummy> , is ( notNullValue ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.Dummy> . size ( ) , is ( equalTo ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore ( java.lang.String ) public void void ( ) { java.util.List<org.springframework.data.jpa.repository.Dummy> < Dummy > java.util.List<org.springframework.data.jpa.repository.Dummy> = org.springframework.data.jpa.repository.DummyRepository . adHocProcedureWith1InputAnd1OutputParameterWithResultSetWithUpdate ( STRING ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.Dummy> , is ( notNullValue ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.Dummy> . size ( ) , is ( equalTo ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.DummyRepository . adHocProcedureWith1InputAndNoOutputParameterWithUpdate ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.jpa.repository.DummyRepository . procedureWithNoInputAnd1OutputParameter ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.jpa.repository.DummyRepository . procedureWith1InputAnd1OutputParameter ( NUMBER ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.DummyRepository . procedureWith1InputAndNoOutputParameter ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore ( java.lang.String ) public void void ( ) { java.util.List<org.springframework.data.jpa.repository.Dummy> < Dummy > java.util.List<org.springframework.data.jpa.repository.Dummy> = org.springframework.data.jpa.repository.DummyRepository . procedureWith1InputAnd1OutputParameterWithResultSet ( STRING ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.Dummy> , is ( notNullValue ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.Dummy> . size ( ) , is ( equalTo ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore ( java.lang.String ) public void void ( ) { java.util.List<org.springframework.data.jpa.repository.Dummy> < Dummy > java.util.List<org.springframework.data.jpa.repository.Dummy> = org.springframework.data.jpa.repository.DummyRepository . procedureWith1InputAnd1OutputParameterWithResultSetWithUpdate ( STRING ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.Dummy> , is ( notNullValue ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.Dummy> . size ( ) , is ( equalTo ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.DummyRepository . procedureWith1InputAndNoOutputParameterWithUpdate ( STRING ) ; }  <METHOD_END>
