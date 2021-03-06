package com.mega.vocabulary;

public class BusinessProcess implements AssessableObject,AssessmentContextObject,SolManProcessStepMappedElement,SolManScenarioMappedElement,SolManProcessMappedElement,ImpactedElement,TimeDependentElement,ThemeScope,KeywordElement,ElementWithExternalReference,GenericObject,RegulationFrameworkScope,InteractionOwnerElement,RoleOwnerElement,ActivityScope,AuditScope,AuditPlanScope,ElementWithNote,ControlImplementationElement,SequenceFlowElement,TransferCandidateObject,FolderOfObjectsElement,TestScope,EAGRCObject,SimulationStep,AssignmentObject,ReportValue,DefinedObject,SimulationEntryPoint,StandardDefinitionElement,RolePlayerElement,ElementOfTheProject,ActionPlanScope,WorkflowSubject,ComplianceTestScope,ElementGovernedByBusinessPolicy,ElementUsingASystem,SubstitutableObject,ElementProvidingIndicator,ElementAtRisk,ControlContextElement,MEGAProcessForTOGAF,RootMappedElement,BPMNElement,ElementWithOffering,ActionScope,ParticipantElement,ElementInAPortfolio,CapabilityDrivenElement,ElementWithBusinessDocument,ElementWithReportMSWord,MappedElement,RecommendationScope,TOGAFProcess,ArchitectureElement,DescribedElement,ElementWithDashboard,ObjectiveDrivenElement,BPMNProcess,ProjectArchitectureProduct,RequestForChangeRelatedObject,MonitoredObject,ConstrainedElement,LDCElementScope,LibraryElement,ElementUsingStandard,RequirementDrivenElement,BPMNActivity,DataObjectElement,MessageFlowElement {
/*MetaClass ID*/
    public static String ID = "~pj)grmQ9pG90[Business Process]";
/*MetaAttributes*/
    public static final String MA_FixedDuration = "~9CfMsgbroG00[X]";
    public static final String MA_ConvertedNameVersion = "~nOU8g8IMCb30[X]";
    public static final String MAV_ConvertedNameVersion_ConvertedNameVersion72SP5 = "29264";
    public static final String MAV_ConvertedNameVersion_ConvertedNameVersion72SP4 = "29248";
    public static final String MAV_ConvertedNameVersion_ConvertedNameVersion75 = "29952";
    public static final String MAV_ConvertedNameVersion_ConvertedNameVersion731 = "29456";
    public static final String MA_Comment = "~f10000000b20[X]";
    public static final String MA_Log = "~f20000000b60[X]";
    public static final String MA_GenericLocalName = "~g20000000f60[X]";
    public static final String MA_CommentBody = "~m20000000170[X]";
    public static final String MA_ControlCount = "~qavHiXaA5530[X]";
    public static final String MA_RiskCount = "~TcvHlVaA5X10[X]";
    public static final String MA_NumberOfIncidents = "~JaLHgSq2IbZR[X]";
    public static final String MA_Valuation = "~YXgd2jAuFXAM[X]";
    public static final String MA_Completeness = "~cWgdViAuFz8M[X]";
    public static final String MA_RightsAndObligations = "~MYgdTjAuF5CM[X]";
    public static final String MA_PresentationAndDisclosure = "~GZgd(jAuFfDM[X]";
    public static final String MA_Existence = "~PZgdihAuFP7M[X]";
    public static final String MA_Currency = "~lVMAgLaSy800[X]";
    public static final String MAV_Currency_U = "USD";
    public static final String MAV_Currency_E = "EUR";
    public static final String MAV_Currency_LuxembourgianFranc = "LUF";
    public static final String MAV_Currency_IrishPunt = "IEP";
    public static final String MAV_Currency_DutchGuilder = "NLG";
    public static final String MAV_Currency_Schilling = "ATS";
    public static final String MAV_Currency_GreekDrachma = "GRD";
    public static final String MAV_Currency_Escudo = "PTE";
    public static final String MAV_Currency_F = "FRF";
    public static final String MAV_Currency_G = "GBP";
    public static final String MAV_Currency_Mark = "DEM";
    public static final String MAV_Currency_Peseta = "ESP";
    public static final String MAV_Currency_J = "JPY";
    public static final String MAV_Currency_Lira = "ITL";
    public static final String MAV_Currency_BelgianFranc = "BEF";
    public static final String MAV_Currency_DanishKrone = "DKK";
    public static final String MA_BusinessProcessVariantImplication = "~(GnKdi5uxe30[X]";
    public static final String MAV_BusinessProcessVariantImplication_Root = "R";
    public static final String MAV_BusinessProcessVariantImplication_Variant = "V";
    public static final String MA_BusinessProcessStatus = "~7YMdieRdIzbJ[X]";
    public static final String MAV_BusinessProcessStatus_UpdateInProgress = "TBS";
    public static final String MAV_BusinessProcessStatus_Validated = "VAL";
    public static final String MAV_BusinessProcessStatus_ValidationInProgress = "TBV";
    public static final String MA_DesignBA = "~k)k1CbJpI539[X]";
    public static final String MAV_DesignBA_Medium = "3";
    public static final String MAV_DesignBA_Poor = "2";
    public static final String MAV_DesignBA_VeryGood = "5";
    public static final String MAV_DesignBA_VeryPoor = "1";
    public static final String MAV_DesignBA_Good = "4";
    public static final String MAV_DesignBA_Design0NA = "0";
    public static final String MA_KnowledgeBA = "~Mzk1pbJpI979[X]";
    public static final String MAV_KnowledgeBA_VeryWellKnown = "5";
    public static final String MAV_KnowledgeBA_Knowledge0NA = "0";
    public static final String MAV_KnowledgeBA_Poor = "2";
    public static final String MAV_KnowledgeBA_WellKnown = "4";
    public static final String MAV_KnowledgeBA_Unknown = "1";
    public static final String MAV_KnowledgeBA_Medium = "3";
    public static final String MA_ITSupportBA = "~R(k11cJpIbA9[X]";
    public static final String MAV_ITSupportBA_Good = "4";
    public static final String MAV_ITSupportBA_ITSupport0NA = "0";
    public static final String MAV_ITSupportBA_Medium = "3";
    public static final String MAV_ITSupportBA_VeryPoor = "1";
    public static final String MAV_ITSupportBA_Poor = "2";
    public static final String MAV_ITSupportBA_VeryGood = "5";
    public static final String MA_ExecutionBA = "~W)k1FcJpI1E9[X]";
    public static final String MAV_ExecutionBA_Inefficient = "1";
    public static final String MAV_ExecutionBA_Good = "4";
    public static final String MAV_ExecutionBA_Execution0NA = "0";
    public static final String MAV_ExecutionBA_Medium = "3";
    public static final String MAV_ExecutionBA_Insufficient = "2";
    public static final String MAV_ExecutionBA_VeryGood = "5";
    public static final String MA_EfficiencyBA = "~gyk1XcJpITH9[X]";
    public static final String MAV_EfficiencyBA_High = "4";
    public static final String MAV_EfficiencyBA_Efficiency0NA = "0";
    public static final String MAV_EfficiencyBA_Medium = "3";
    public static final String MAV_EfficiencyBA_Low = "2";
    public static final String MAV_EfficiencyBA_VeryLow = "1";
    public static final String MAV_EfficiencyBA_VeryHigh = "5";
    public static final String MA_BusinessValueBA = "~kzk1kcJpIvK9[X]";
    public static final String MAV_BusinessValueBA_BusinessValue0NA = "0";
    public static final String MAV_BusinessValueBA_VeryLow = "1";
    public static final String MAV_BusinessValueBA_Medium = "3";
    public static final String MAV_BusinessValueBA_Low = "2";
    public static final String MAV_BusinessValueBA_High = "4";
    public static final String MAV_BusinessValueBA_VeryHigh = "5";
    public static final String MA_RiskBA = "~m(k1vcJpILO9[X]";
    public static final String MAV_RiskBA_VeryHigh = "1";
    public static final String MAV_RiskBA_Low = "4";
    public static final String MAV_RiskBA_Medium = "3";
    public static final String MAV_RiskBA_VeryLow = "5";
    public static final String MAV_RiskBA_Risk0NA = "0";
    public static final String MAV_RiskBA_High = "2";
    public static final String MA_PerformanceBA = "~()k18dJpIHS9[X]";
    public static final String MAV_PerformanceBA_Low = "2";
    public static final String MAV_PerformanceBA_VeryHigh = "5";
    public static final String MAV_PerformanceBA_VeryLow = "1";
    public static final String MAV_PerformanceBA_High = "4";
    public static final String MAV_PerformanceBA_Performance0NA = "0";
    public static final String MAV_PerformanceBA_Medium = "3";
    public static final String MA_BusinessProcessType = "~W88BoqoqvS00[X]";
    public static final String MAV_BusinessProcessType_Group = "G";
    public static final String MA_FixedCost = "~aqh52aXexSb0[X]";
    public static final String MA_BusinessProcessCode = "~OCiAvqYFvu40[X]";
    public static final String MA_Purpose = "~7cwMFl57pe00[X]";
/*MetaAssociationEnds*/
    public static final String MAE_Test = "~2z4j5uFZILK6[Business Process.Test]";
    public static final String MAE_BusinessProcessManager = "~quhNF1cg)080[Business Process.Business Process Manager]";
    public static final String MAE_ComplianceTest = "~cDcy9YW0IryN[Business Process.Compliance Test]";
    public static final String MAE_Audit = "~K)niXayTHTVM[Business Process.Audit]";
    public static final String MAE_DurationHypothesis = "~Td8kOYhuxy20[Business Process.Duration Hypothesis]";
    public static final String MAE_OwnedExchange = "~JLwbme9n)e40[Business Process.Owned Exchange]";
    public static final String MAE_CostHypothesis = "~Qa8kPYhuxi60[Business Process.Cost Hypothesis]";
    public static final String MAE_ExternalReference = "~xYfBKxI1rOx0[Business Process.External Reference]";
    public static final String MAE_EvaluationHypothesis = "~Nb8kPYhuxWA0[Business Process.Evaluation Hypothesis]";
    public static final String MAE_ImplyingHypothesis = "~wb8kPYhuxiC0[Business Process.Implying Hypothesis]";
    public static final String MAE_MappingLeft = "~OLRL49P15P22[Business Process.Mapping Left]";
    public static final String MAE_Variant = "~X9T2Jfmtxy00[Business Process.Variant]";
    public static final String MAE_VariantRoot = "~W9T2Jfmtxu00[Business Process.Variant Root]";
    public static final String MAE_RealizedRequirement = "~cW)6VpHcxCK0[Business Process.Realized Requirement]";
    public static final String MAE_MappingRight = "~NMRLn9P15X32[Business Process.Mapping Right]";
    public static final String MAE_UsedLibrary = "~h5YSy9O8ziN0[Business Process.Used Library]";
    public static final String MAE_StartMessage = "~lDT4kF1K1XV0[Business Process.Start Message]";
    public static final String MAE_ActionPlan = "~wL(JBWfzHTHH[Business Process.Action Plan]";
    public static final String MAE_Application = "~i4n)MzlZpO00[Business Process.Application]";
    public static final String MAE_EndMessage = "~yDT4kF1K1HW0[Business Process.End Message]";
    public static final String MAE_OwnedSynchronization = "~7EjBMqJJyaQ0[Business Process.Owned Synchronization]";
    public static final String MAE_OwnedLoop = "~bEjBZqJJyeR0[Business Process.Owned Loop]";
    public static final String MAE_SimulationHypothesis = "~0PUBf63g(q60[Business Process.Simulation Hypothesis]";
    public static final String MAE_OwnedCondition = "~PDjBwpJJyWP0[Business Process.Owned Condition]";
    public static final String MAE_MappingItemRight = "~p8JSxYe15vF1[Business Process.MappingItem Right]";
    public static final String MAE_ImposedRequirement = "~FCzbDhf5yiU0[Business Process.Imposed Requirement]";
    public static final String MAE_AssignedObjective = "~1R65VIXKpy00[Business Process.Assigned Objective]";
    public static final String MAE_MessageWithinModel = "~pgPUizqQziZ0[Business Process.Message within Model]";
    public static final String MAE_OwnedMessage = "~dgPUizqQzyY0[Business Process.Owned Message]";
    public static final String MAE_DataModel = "~48K1vPIy1fk0[Business Process.Data-Model]";
    public static final String MAE_CorrelatedDataCollector = "~v82KlrMU)C30[Business Process.Correlated Data Collector]";
    public static final String MAE_MappingItemLeft = "~u9JSjZe151H1[Business Process.MappingItem Left]";
    public static final String MAE_OrganizationalProcess = "~6R65VIXKpG10[Business Process.Organizational Process]";
    public static final String MAE_AchievedObjective = "~0btFk0qrxCG1[Business Process.Achieved Objective]";
    public static final String MAE_Control = "~IkNGptcUHfJS[Business Process.Control]";
    public static final String MAE_SystemProcess = "~qVMZFyutyS40[Business Process.System Process]";
    public static final String MAE_RecordedIssue = "~Aivtt0lY)yP0[Business Process.Recorded Issue]";
    public static final String MAE_Risk = "~V7famQPxyia0[Business Process.Risk]";
    public static final String MAE_BusinessLine = "~gHqbJ1QPGPPK[Business Process.Business Line]";
    public static final String MAE_OrgUnit = "~zj)gsmQ9pq90[Business Process.Org-Unit]";
    public static final String MAE_MessageReceived = "~Qk)gumQ9pWB0[Business Process.Message Received]";
    public static final String MAE_MessageSent = "~Gk)gtmQ9pyA0[Business Process.Message Sent]";
    public static final String MAE_Keyword = "~7k)gtmQ9pOA0[Business Process.Keyword]";
    public static final String MAE_Description = "~Zk)gumQ9p4C0[Business Process.Description]";
    public static final String MAE_Diagram = "~fk)gumQ9pSC0[Business Process.Diagram]";
    public static final String MAE_ImplementedControl = "~sGawH0294rc0[Business Process.Implemented Control]";
    public static final String MAE_Operation = "~)k)gvmQ9pmD0[Business Process.Operation]";
    public static final String MAE_Note = "~sk)gvmQ9pCD0[Business Process.Note]";
    public static final String MAE_NextBusinessProcess = "~Il)gwmQ9puE0[Business Process.Next Business Process]";
    public static final String MAE_Component = "~8l)gvmQ9pKE0[Business Process.Component]";
    public static final String MAE_PreviousBusinessProcess = "~Fl)gwmQ9piE0[Business Process.Previous Business Process]";
    public static final String MAE_AggregationOf = "~5l)gvmQ9p8E0[Business Process.Aggregation of]";
    public static final String MAE_SuperType = "~Rl)gwmQ9pSF0[Business Process.Super type]";
    public static final String MAE_Timer = "~kl)gwmQ9paG0[Business Process.Timer]";
    public static final String MAE_Project = "~Xl)gwmQ9pqF0[Business Process.Project]";
    public static final String MAE_SubType = "~Ol)gwmQ9pGF0[Business Process.Sub type]";
    public static final String MAE_UsedAllocation = "~MVCuYlEvy4K0[Business Process.Used Allocation]";
    public static final String MAE_ParentFolder = "~xL4n5WiM1P01[Business Process.Parent Folder]";
    public static final String MAE_DataPackage = "~5SJvhL(uye70[Business Process.Data Package]";
    public static final String MAE_SolManScenario = "~BTyxdE)P6na0[Business Process.SolMan Scenario]";
    public static final String MAE_ReportMSWord = "~1i)gxmQ9piH0[Business Process.Report (MS Word)]";
    public static final String MAE_Site = "~ul)gxmQ9p8H0[Business Process.Site]";
    public static final String MAE_BusinessFunction = "~7i)gxmQ9p4I0[Business Process.Business Function]";
    public static final String MAE_SolManProcess = "~ZVyx2F)P6bi0[Business Process.SolMan Process]";
    public static final String MAE_OwnedRole = "~gbQp96Dj)SA0[Business Process.Owned Role]";
    public static final String MAE_StarterRole = "~VcQpj6Dj)WB0[Business Process.Starter Role]";
    public static final String MAE_OwnedBusinessProcess = "~Zs()h50XBn70[Business Process.Owned Business Process]";
    public static final String MAE_OwnerBusinessProcess = "~Ys()h50XBj70[Business Process.Owner Business Process]";
    public static final String MAE_MacroIncident = "~VwNjs2y(H96I[Business Process.Macro Incident]";
    public static final String MAE_Dashboard = "~(WHcWhPc)i30[Business Process.Dashboard]";
    public static final String MAE_OwnedActivity = "~MfXPLe61z4H1[Business Process.Owned Activity]";
    public static final String MAE_Server = "~TqEd)yw)Gj2B[Business Process.Server]";
    public static final String MAE_FunctionalActivity = "~YfXPLe61zqH1[Business Process.Functional Activity]";
    public static final String MAE_Database = "~9qEdiww)GnwA[Business Process.Database]";
    public static final String MAE_ControlSystem = "~LA8DzMpO5L40[Business Process.Control System]";
    public static final String MAE_Incident = "~ojTq0XzsHXXQ[Business Process.Incident]";
    public static final String MAE_InteractionWithinModel = "~NYxhMDCQ(ic1[Business Process.Interaction within Model]";
    public static final String MAE_DesignerOrgUnit = "~ToMTbYdAvm30[Business Process.Designer Org-Unit]";
    public static final String MAE_OwnedInteraction = "~JXxhFkBQ(WF1[Business Process.Owned Interaction]";
    public static final String MAE_UseCase = "~4zF4ySotpKx2[Business Process.Use Case]";
    public static final String MAE_DataCollector = "~5mSqOOzk(480[Business Process.Data Collector]";
    public static final String MAE_AnimationHypothesis = "~LxrU2tNAzS50[Business Process.Animation Hypothesis]";
    public static final String MAE_RegulationFramework = "~Gjq8Aar7I903[Business Process.Regulation Framework]";
    public static final String MAE_TriggeredInteraction = "~bo3zfI)ivmE0[Business Process.Triggered Interaction]";
    public static final String MAE_Account = "~Mn2B9zoMGLeL[Business Process.Account]";
    public static final String MAE_TriggeringInteraction = "~no3zgI)ivSF0[Business Process.Triggering Interaction]";
    public static final String MAE_Indicator = "~VR9es2Q5uO00[Business Process.Indicator]";
    public static final String MAE_IncidentFinancialElement = "~dO9hNxwsHb)E[Business Process.Incident Financial Element]";
    public static final String MAE_FunctionalProcess = "~mP89K9KH9zv0[Business Process.Functional Process]";
    public static final String MAE_ApplicationSystem = "~LwaERnJqJnZ5[Business Process.Application System]";
    public static final String MAE_Chapter = "~O779WIIAvq10[Business Process.Chapter]";
    public static final String MAE_Constraint = "~X779WIIAvO20[Business Process.Constraint]";

}
