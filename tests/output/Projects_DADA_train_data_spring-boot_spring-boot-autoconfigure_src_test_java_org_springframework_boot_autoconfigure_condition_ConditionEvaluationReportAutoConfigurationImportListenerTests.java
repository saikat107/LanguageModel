<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.autoconfigure.condition.ConditionEvaluationReportAutoConfigurationImportListener = new ConditionEvaluationReportAutoConfigurationImportListener ( ) ; this . org.springframework.boot.autoconfigure.condition.ConditionEvaluationReportAutoConfigurationImportListener . setBeanFactory ( this . org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.boot.autoconfigure.condition.AutoConfigurationImportListener> < AutoConfigurationImportListener > java.util.List<org.springframework.boot.autoconfigure.condition.AutoConfigurationImportListener> = SpringFactoriesLoader . loadFactories ( AutoConfigurationImportListener .class , null ) ; assertThat ( java.util.List<org.springframework.boot.autoconfigure.condition.AutoConfigurationImportListener> ) . hasAtLeastOneElementOfType ( ConditionEvaluationReportAutoConfigurationImportListener .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Collections . java.util.List<java.lang.String> ( STRING ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = java.util.Collections . java.util.Set<java.lang.String> ( ) ; AutoConfigurationImportEvent org.springframework.boot.autoconfigure.condition.AutoConfigurationImportEvent = new AutoConfigurationImportEvent ( this , java.util.List<java.lang.String> , java.util.Set<java.lang.String> ) ; this . org.springframework.boot.autoconfigure.condition.ConditionEvaluationReportAutoConfigurationImportListener . onAutoConfigurationImportEvent ( org.springframework.boot.autoconfigure.condition.AutoConfigurationImportEvent ) ; ConditionEvaluationReport org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport = ConditionEvaluationReport . get ( this . org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory ) ; assertThat ( org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport . getUnconditionalClasses ( ) ) . containsExactlyElementsOf ( java.util.List<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Collections . java.util.List<java.lang.String> ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = java.util.Collections . java.util.Set<java.lang.String> ( STRING ) ; AutoConfigurationImportEvent org.springframework.boot.autoconfigure.condition.AutoConfigurationImportEvent = new AutoConfigurationImportEvent ( this , java.util.List<java.lang.String> , java.util.Set<java.lang.String> ) ; this . org.springframework.boot.autoconfigure.condition.ConditionEvaluationReportAutoConfigurationImportListener . onAutoConfigurationImportEvent ( org.springframework.boot.autoconfigure.condition.AutoConfigurationImportEvent ) ; ConditionEvaluationReport org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport = ConditionEvaluationReport . get ( this . org.springframework.boot.autoconfigure.condition.ConfigurableListableBeanFactory ) ; assertThat ( org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport . getExclusions ( ) ) . containsExactlyElementsOf ( java.util.Set<java.lang.String> ) ; }  <METHOD_END>