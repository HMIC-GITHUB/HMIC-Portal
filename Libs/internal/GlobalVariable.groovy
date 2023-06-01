package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object PC_Username
     
    /**
     * <p></p>
     */
    public static Object PC_Password
     
    /**
     * <p></p>
     */
    public static Object currentDateAndTime
     
    /**
     * <p></p>
     */
    public static Object TCName
     
    /**
     * <p></p>
     */
    public static Object State
     
    /**
     * <p></p>
     */
    public static Object LOB
     
    /**
     * <p></p>
     */
    public static Object AccountNumber
     
    /**
     * <p></p>
     */
    public static Object SubmissionNumber
     
    /**
     * <p></p>
     */
    public static Object PolicyNumber
     
    /**
     * <p></p>
     */
    public static Object ExecutionStatus
     
    /**
     * <p></p>
     */
    public static Object PortalURL
     
    /**
     * <p></p>
     */
    public static Object Portal_Username
     
    /**
     * <p></p>
     */
    public static Object Portal_Password
     
    /**
     * <p></p>
     */
    public static Object Cook_County_Premium
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            URL = selectedVariables['URL']
            PC_Username = selectedVariables['PC_Username']
            PC_Password = selectedVariables['PC_Password']
            currentDateAndTime = selectedVariables['currentDateAndTime']
            TCName = selectedVariables['TCName']
            State = selectedVariables['State']
            LOB = selectedVariables['LOB']
            AccountNumber = selectedVariables['AccountNumber']
            SubmissionNumber = selectedVariables['SubmissionNumber']
            PolicyNumber = selectedVariables['PolicyNumber']
            ExecutionStatus = selectedVariables['ExecutionStatus']
            PortalURL = selectedVariables['PortalURL']
            Portal_Username = selectedVariables['Portal_Username']
            Portal_Password = selectedVariables['Portal_Password']
            Cook_County_Premium = selectedVariables['Cook_County_Premium']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
