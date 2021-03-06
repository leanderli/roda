/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE file at the root of the source
 * tree and available online at
 *
 * https://github.com/keeps/roda
 */
package org.roda.wui.client.common.lists.utils;

import org.roda.core.data.v2.index.filter.Filter;
import org.roda.core.data.v2.ip.AIP;
import org.roda.core.data.v2.ip.DIP;
import org.roda.core.data.v2.ip.DIPFile;
import org.roda.core.data.v2.ip.File;
import org.roda.core.data.v2.ip.IndexedAIP;
import org.roda.core.data.v2.ip.IndexedDIP;
import org.roda.core.data.v2.ip.IndexedFile;
import org.roda.core.data.v2.ip.IndexedRepresentation;
import org.roda.core.data.v2.ip.Representation;
import org.roda.core.data.v2.ip.TransferredResource;
import org.roda.core.data.v2.jobs.IndexedReport;
import org.roda.core.data.v2.jobs.Job;
import org.roda.core.data.v2.jobs.Report;
import org.roda.core.data.v2.log.LogEntry;
import org.roda.core.data.v2.notifications.Notification;
import org.roda.core.data.v2.ri.RepresentationInformation;
import org.roda.core.data.v2.risks.IndexedRisk;
import org.roda.core.data.v2.risks.Risk;
import org.roda.core.data.v2.risks.RiskIncidence;
import org.roda.core.data.v2.user.RODAMember;
import org.roda.wui.client.common.LastSelectedItemsSingleton;
import org.roda.wui.client.common.lists.AIPList;
import org.roda.wui.client.common.lists.DIPFileList;
import org.roda.wui.client.common.lists.DIPList;
import org.roda.wui.client.common.lists.JobList;
import org.roda.wui.client.common.lists.LogEntryList;
import org.roda.wui.client.common.lists.NotificationList;
import org.roda.wui.client.common.lists.RepresentationInformationList;
import org.roda.wui.client.common.lists.RepresentationList;
import org.roda.wui.client.common.lists.RiskIncidenceList;
import org.roda.wui.client.common.lists.RiskList;
import org.roda.wui.client.common.lists.RodaMemberList;
import org.roda.wui.client.common.lists.SimpleFileList;
import org.roda.wui.client.common.lists.SimpleJobReportList;
import org.roda.wui.client.common.lists.TransferredResourceList;

import com.google.gwt.core.client.GWT;

import config.i18n.client.ClientMessages;

public class ListFactory {

  private static final ClientMessages messages = GWT.create(ClientMessages.class);

  public BasicAsyncTableCell<?> getList(String actualClass, String title, Filter filter, boolean selectable,
    int pageSize, int incrementPage) {
    if (actualClass.equals(AIP.class.getName()) || actualClass.equals(IndexedAIP.class.getName())) {
      return new AIPList(filter, LastSelectedItemsSingleton.getInstance().isSelectedJustActive(), null,
        messages.selectAipSearchResults(), selectable, pageSize, incrementPage);
    } else if (actualClass.equals(Representation.class.getName())
      || actualClass.equals(IndexedRepresentation.class.getName())) {
      return new RepresentationList(filter, LastSelectedItemsSingleton.getInstance().isSelectedJustActive(), null,
        messages.selectRepresentationSearchResults(), selectable, pageSize, incrementPage);
    } else if (actualClass.equals(File.class.getName()) || actualClass.equals(IndexedFile.class.getName())) {
      return new SimpleFileList(filter, LastSelectedItemsSingleton.getInstance().isSelectedJustActive(), null,
        messages.selectFileSearchResults(), selectable, pageSize, incrementPage);
    } else if (actualClass.equals(RepresentationInformation.class.getName())) {
      return new RepresentationInformationList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(IndexedRisk.class.getName()) || actualClass.equals(Risk.class.getName())) {
      return new RiskList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(RiskIncidence.class.getName())) {
      return new RiskIncidenceList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(Job.class.getName())) {
      return new JobList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(Report.class.getName()) || actualClass.equals(IndexedReport.class.getName())) {
      return new SimpleJobReportList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(TransferredResource.class.getName())) {
      return new TransferredResourceList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(Notification.class.getName())) {
      return new NotificationList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(LogEntry.class.getName())) {
      return new LogEntryList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(RODAMember.class.getName())) {
      return new RodaMemberList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(DIP.class.getName()) || actualClass.equals(IndexedDIP.class.getName())) {
      return new DIPList(filter, null, title, selectable, pageSize, incrementPage);
    } else if (actualClass.equals(DIPFile.class.getName())) {
      return new DIPFileList(filter, null, title, selectable, pageSize, incrementPage);
    } else {
      return null;
    }
  }

}
