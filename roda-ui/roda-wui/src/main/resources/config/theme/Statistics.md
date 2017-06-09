# Statistics

This page shows a dashboard of statistics concerning several aspects of the repository. Statistics are organised by sections, each of these focusing on a particular aspect of the repository, e.g. issues related to metadata and data, statistics about ingest and preservation processes, figures about users and authentication issues, preservation events, risk management and notifications.

## Metadata

#### Number of intellectual entities

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.IndexedAIP" data-source-only-active="true" data-view="text" data-view-field="totalCount"></span>

#### Distribution of description levels (top 10)

<canvas id="stat-desc-levels" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.IndexedAIP" data-source-facets="level" data-view="chart" data-view-field="facetResults" data-view-type="pie" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="stat-desc-levels" data-view="download" data-view-filename="description-levels.csv"></span>

#### User move actions (top 10)

<canvas id="user-move-actions" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.log.LogEntry" data-source-facets="username" data-view="chart" data-source-filters="actionMethod=moveAIPInHierarchy" data-view-field="facetResults" data-view-type="pie" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="user-move-actions" data-view="download" data-view-filename="user-move-actions.csv"></span>

#### User descriptive metadata creations (top 10)

<canvas id="user-desc-creations" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.log.LogEntry" data-source-facets="username" data-view="chart" data-source-filters="actionMethod=createDescriptiveMetadataFile" data-view-field="facetResults" data-view-type="pie" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="user-desc-creations" data-view="download" data-view-filename="user-desc-creations.csv"></span>

#### User descriptive metadata updates (top 10)

<canvas id="user-desc-updates" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.log.LogEntry" data-source-facets="username" data-view="chart" data-source-filters="actionMethod=updateDescriptiveMetadataFile" data-view-field="facetResults" data-view-type="pie" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="user-desc-updates" data-view="download" data-view-filename="user-desc-updates.csv"></span>

#### User descriptive metadata deletes (top 10)

<canvas id="user-desc-deletes" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.log.LogEntry" data-source-facets="username" data-view="chart" data-source-filters="actionMethod=deleteAIPDescriptiveMetadataFile" data-view-field="facetResults" data-view-type="pie" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="user-desc-deletes" data-view="download" data-view-filename="user-desc-deletes.csv"></span>

## Data

#### Number of representations

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.IndexedRepresentation" data-view="text" data-view-field="totalCount"></span>

#### Distribution of representation types

<canvas id="representation-types" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.IndexedRepresentation" data-source-facets="type" data-view="chart" data-view-field="facetResults" data-view-type="horizontalBar"></canvas>

<span class="statistic toolbarLink" data-ref="representation-types" data-view="download" data-view-filename="representation-types.csv"></span>

#### Number of files

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.IndexedFile" data-view="text" data-view-field="totalCount"></span>

#### Distribution of file PRONOMs (top 10)

<canvas id="file-formats-pronom" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.IndexedFile" data-source-facets="formatPronom" data-view="chart" data-view-field="facetResults" data-view-type="horizontalBar" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="file-formats-pronom" data-view="download" data-view-filename="file-formats-pronom.csv"></span>

#### Distribution of file formats (top 10)

<canvas id="file-formats-description" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.IndexedFile" data-source-facets="fileFormat" data-view="chart" data-view-field="facetResults" data-view-type="horizontalBar" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="file-formats-description" data-view="download" data-view-filename="file-formats-description.csv"></span>

#### Distribution of file mimetypes (top 10)

<canvas id="file-formats-mimetypes" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.IndexedFile" data-source-facets="formatMimetype" data-view="chart" data-view-field="facetResults" data-view-type="horizontalBar" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="file-formats-mimetypes" data-view="download" data-view-filename="file-formats-mimetypes.csv"></span>

## Processes

#### Number of action processes

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.jobs.Job" data-view="text" data-source-filters="!pluginType=INGEST" data-view-field="totalCount"></span>

#### Distribution of action process status

<canvas id="process-action-status" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.jobs.Job" data-source-facets="state" data-view="chart" data-source-filters="!pluginType=INGEST" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="process-action-status" data-view="download" data-view-filename="process-action-status.csv"></span>

#### Distribution of action process type

<canvas id="process-action-type" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.jobs.Job" data-source-facets="pluginType" data-view="chart" data-source-filters="!pluginType=INGEST" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="process-action-type" data-view="download" data-view-filename="process-action-type.csv"></span>

#### Number of ingest processes

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.jobs.Job" data-view="text" data-source-filters="pluginType=INGEST" data-view-field="totalCount"></span>

#### Distribution of process status

<canvas id="process-ingest-status" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.jobs.Job" data-source-facets="state" data-view="chart" data-source-filters="pluginType=INGEST" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="process-ingest-status" data-view="download" data-view-filename="process-ingest-status.csv"></span>

#### Number of appraisals (top 10)

<canvas id="appraisal" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.log.LogEntry" data-source-facets="username" data-view="chart" data-source-filters="actionMethod=appraisal" data-view-field="facetResults" data-view-type="pie" data-view-limit="10"></canvas>

<span class="statistic toolbarLink" data-ref="appraisal" data-view="download" data-view-filename="appraisal.csv"></span>

#### Number of reports

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.jobs.IndexedReport" data-view="text" data-view-field="totalCount"></span>

#### Distribution of report plugin (top 5)

<canvas id="process-reports-plugin" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.jobs.IndexedReport" data-source-facets="pluginName" data-view="chart" data-source-filters="!plugin=org.roda.core.plugins.plugins.ingest.AutoAcceptSIPPlugin" data-view-field="facetResults" data-view-type="horizontalBar" data-view-limit="5"></canvas>

<span class="statistic toolbarLink" data-ref="process-reports-plugin" data-view="download" data-view-filename="process-reports-plugin.csv"></span>

#### Distribution of report plugin state

<canvas id="process-reports-plugin-state" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.jobs.IndexedReport" data-source-facets="pluginState" data-view="chart" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="process-reports-plugin-state" data-view="download" data-view-filename="process-reports-plugin-state.csv"></span>

#### Users that started more processes (top 5)

<canvas id="process-users" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.log.LogEntry" data-source-facets="username" data-view="chart" data-source-filters="actionMethod=createJob" data-view-field="facetResults" data-view-type="horizontalBar" data-view-limit="5"></canvas>

<span class="statistic toolbarLink" data-ref="process-users" data-view="download" data-view-filename="process-users.csv"></span>

## Users

#### Number of users

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.user.RODAMember" data-view="text" data-source-filters="isUser=true" data-view-field="totalCount"></span>

#### Number of authentications

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.log.LogEntry" data-source-filters="actionComponent=org.roda.wui.api.controllers.UserLogin, actionMethod=login, state=SUCCESS" data-view="text" data-view-field="totalCount"></span>

#### Successful vs failed logins

<canvas id="logins-state" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.log.LogEntry" data-source-filters="actionComponent=org.roda.wui.api.controllers.UserLogin, actionMethod=login" data-source-facets="state" data-view="chart" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="logins-state" data-view="download" data-view-filename="logins-state.csv"></span>

## Transferred resources

#### Number of transferred resources

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.TransferredResource" data-view="text" data-view-field="totalCount"></span>

#### Successful ingestions

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.TransferredResource" data-view="text" data-view-field="totalCount" data-source-filters="ancestors=PROCESSED/SUCCESSFULLY_INGESTED"></span>

#### Failed ingestions

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.TransferredResource" data-view="text" data-view-field="totalCount" data-source-filters="ancestors=PROCESSED/UNSUCCESSFULLY_INGESTED"></span>



## Preservation events

#### Number of preservation events

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.metadata.IndexedPreservationEvent" data-view="text" data-view-field="totalCount"></span>

#### Preservation agents by type (top 5)

<canvas id="preservation-agents-type" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.metadata.IndexedPreservationEvent" data-source-facets="eventType" data-view="chart" data-view-field="facetResults" data-view-type="pie" data-view-limit="5"></canvas>

<span class="statistic toolbarLink" data-ref="preservation-agents-type" data-view="download" data-view-filename="preservation-agents-type.csv"></span>

#### Preservation events by agent (top 5)

<canvas id="preservation-event-agents" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.ip.metadata.IndexedPreservationEvent" data-source-facets="linkingAgentIdentifier" data-view="chart" data-view-field="facetResults" data-view-type="horizontalBar" data-label-function="agentLabel" data-view-limit="5"></canvas>

<script type="text/javascript">function agentLabel(label) { var agent = JSON.parse(label); var valueArray = agent.value.split('@'); var updatedValue = valueArray[0].substring(valueArray[0] .lastIndexOf(".") + 1); updatedValue = updatedValue.substring(updatedValue .lastIndexOf(":") + 1); if (valueArray.length != 1) { updatedValue += "@" + valueArray[1]; } return updatedValue; }</script><span class="statistic toolbarLink" data-ref="preservation-event-agents" data-view="download" data-view-filename="preservation-event-agents.csv"></span>

## Risks

#### Number of risks

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.risks.IndexedRisk" data-view="text" data-view-field="totalCount"></span>

#### Risks by mitigation severity

<canvas id="risk-severity" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.risks.IndexedRisk" data-source-facets="currentSeverityLevel" data-view="chart" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="risk-severity" data-view="download" data-view-filename="risk-severity.csv"></span>

## Risk incidences

#### Number of risk incidences

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.risks.RiskIncidence" data-view="text" data-view-field="totalCount"></span>

#### Risk incidence by severity

<canvas id="risk-incidence-severity" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.risks.RiskIncidence" data-source-facets="severity" data-view="chart" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="risk-incidence-severity" data-view="download" data-view-filename="risk-incidence-severity.csv"></span>

#### Risk incidence by status

<canvas id="risk-incidence-status" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.risks.RiskIncidence" data-source-facets="status" data-view="chart" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="risk-incidence-status" data-view="download" data-view-filename="risk-incidence-status.csv"></span>

## Notification

#### Number of notifications

<span class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.notifications.Notification" data-view="text" data-view-field="totalCount"></span>

#### Acknowledged notifications

<canvas id="notification-acknowledge" class="statistic" data-source="index" data-source-class="org.roda.core.data.v2.notifications.Notification" data-source-facets="isAcknowledged" data-view="chart" data-view-field="facetResults" data-view-type="pie"></canvas>

<span class="statistic toolbarLink" data-ref="notification-acknowledge" data-view="download" data-view-filename="notification-acknowledge.csv"></span>
