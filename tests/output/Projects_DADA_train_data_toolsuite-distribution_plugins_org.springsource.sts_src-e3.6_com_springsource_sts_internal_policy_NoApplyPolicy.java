<METHOD_START> public void ( ) { super(); IProduct com.springsource.sts.internal.policy.IProduct = Platform . getProduct ( ) ; if ( com.springsource.sts.internal.policy.IProduct != null && STRING . boolean ( com.springsource.sts.internal.policy.IProduct . getId ( ) ) ) { setRestartPolicy ( RESTART_POLICY_PROMPT ) ; } }  <METHOD_END>