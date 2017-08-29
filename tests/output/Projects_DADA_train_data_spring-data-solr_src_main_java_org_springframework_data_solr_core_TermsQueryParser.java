<METHOD_START> @ java.lang.Override public org.springframework.data.solr.core.SolrQuery org.springframework.data.solr.core.SolrQuery ( TermsQuery org.springframework.data.solr.core.TermsQuery ) { Assert . notNull ( org.springframework.data.solr.core.TermsQuery , STRING ) ; SolrQuery org.springframework.data.solr.core.SolrQuery = new SolrQuery ( ) ; java.lang.String java.lang.String = getQueryString ( org.springframework.data.solr.core.TermsQuery ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.data.solr.core.SolrQuery . setParam ( CommonParams . Q , java.lang.String ) ; } void ( org.springframework.data.solr.core.TermsQuery . getTermsOptions ( ) , org.springframework.data.solr.core.SolrQuery ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.TermsQuery ) ; appendRequestHandler ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.TermsQuery . getRequestHandler ( ) ) ; return org.springframework.data.solr.core.SolrQuery ; }  <METHOD_END>
<METHOD_START> protected void void ( TermsOptions org.springframework.data.solr.core.TermsOptions , SolrQuery org.springframework.data.solr.core.SolrQuery ) { org.springframework.data.solr.core.SolrQuery . setTerms ( true ) ; if ( org.springframework.data.solr.core.TermsOptions . getLimit ( ) >= NUMBER ) { org.springframework.data.solr.core.SolrQuery . setTermsLimit ( org.springframework.data.solr.core.TermsOptions . getLimit ( ) ) ; } if ( org.springframework.data.solr.core.TermsOptions . getMaxCount ( ) >= - NUMBER ) { org.springframework.data.solr.core.SolrQuery . setTermsMaxCount ( org.springframework.data.solr.core.TermsOptions . getMaxCount ( ) ) ; } if ( org.springframework.data.solr.core.TermsOptions . getMinCount ( ) >= NUMBER ) { org.springframework.data.solr.core.SolrQuery . setTermsMinCount ( org.springframework.data.solr.core.TermsOptions . getMinCount ( ) ) ; } if ( StringUtils . hasText ( org.springframework.data.solr.core.TermsOptions . getPrefix ( ) ) ) { org.springframework.data.solr.core.SolrQuery . setTermsPrefix ( org.springframework.data.solr.core.TermsOptions . getPrefix ( ) ) ; } if ( StringUtils . hasText ( org.springframework.data.solr.core.TermsOptions . getRegex ( ) ) ) { org.springframework.data.solr.core.SolrQuery . setTermsRegex ( org.springframework.data.solr.core.TermsOptions . getRegex ( ) ) ; } if ( org.springframework.data.solr.core.TermsOptions . getRegexFlag ( ) != null ) { org.springframework.data.solr.core.SolrQuery . setTermsRegexFlag ( org.springframework.data.solr.core.TermsOptions . getRegexFlag ( ) . toString ( ) . toLowerCase ( ) ) ; } if ( org.springframework.data.solr.core.TermsOptions . getSort ( ) != null ) { org.springframework.data.solr.core.SolrQuery . setTermsSortString ( org.springframework.data.solr.core.TermsOptions . getSort ( ) . toString ( ) . toLowerCase ( ) ) ; } if ( org.springframework.data.solr.core.TermsOptions . getUpperBoundTerm ( ) != null ) { org.springframework.data.solr.core.SolrQuery . setTermsUpper ( org.springframework.data.solr.core.TermsOptions . getUpperBoundTerm ( ) . getTerm ( ) ) ; org.springframework.data.solr.core.SolrQuery . setTermsUpperInclusive ( org.springframework.data.solr.core.TermsOptions . getUpperBoundTerm ( ) . isInclude ( ) ) ; } if ( org.springframework.data.solr.core.TermsOptions . getLowerBoundTerm ( ) != null ) { org.springframework.data.solr.core.SolrQuery . setTermsUpper ( org.springframework.data.solr.core.TermsOptions . getLowerBoundTerm ( ) . getTerm ( ) ) ; org.springframework.data.solr.core.SolrQuery . setTermsUpperInclusive ( org.springframework.data.solr.core.TermsOptions . getLowerBoundTerm ( ) . isInclude ( ) ) ; } if ( ! org.springframework.data.solr.core.TermsOptions . isRaw ( ) ) { org.springframework.data.solr.core.SolrQuery . setTermsRaw ( org.springframework.data.solr.core.TermsOptions . isRaw ( ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , TermsQuery org.springframework.data.solr.core.TermsQuery ) { for ( Field org.springframework.data.solr.core.Field : org.springframework.data.solr.core.TermsQuery . getTermsFields ( ) ) { void ( org.springframework.data.solr.core.Field , org.springframework.data.solr.core.SolrQuery ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( Field org.springframework.data.solr.core.Field , SolrQuery org.springframework.data.solr.core.SolrQuery ) { if ( org.springframework.data.solr.core.Field != null && StringUtils . hasText ( org.springframework.data.solr.core.Field . getName ( ) ) ) { org.springframework.data.solr.core.SolrQuery . addTermsField ( org.springframework.data.solr.core.Field . getName ( ) ) ; } }  <METHOD_END>
