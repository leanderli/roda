/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE file at the root of the source
 * tree and available online at
 *
 * https://github.com/keeps/roda
 */
package org.roda.wui.client.common.dialogs;

import org.roda.core.data.adapter.facet.Facets;
import org.roda.core.data.adapter.filter.BasicSearchFilterParameter;
import org.roda.core.data.adapter.filter.Filter;
import org.roda.core.data.common.RodaConstants;
import org.roda.core.data.v2.ip.IndexedAIP;
import org.roda.wui.client.common.lists.AIPList;

import com.google.gwt.core.client.GWT;

import config.i18n.client.ClientMessages;

public class SelectAipDialog extends DefaultSelectDialog<IndexedAIP, Void> {

  private static final ClientMessages messages = GWT.create(ClientMessages.class);

  private static final Filter DEFAULT_FILTER_AIP = new Filter(
    new BasicSearchFilterParameter(RodaConstants.AIP_SEARCH, "*"));

  private static final Boolean DEFAULT_JUST_ACTIVE = Boolean.TRUE;
  private static final Facets DEFAULT_FACETS = null;
  private static final Boolean SELECTABLE = Boolean.FALSE;

  public SelectAipDialog(String title, boolean hidePreFilters) {
    this(title, DEFAULT_FILTER_AIP, DEFAULT_JUST_ACTIVE, hidePreFilters);
  }

  public SelectAipDialog(String title, Filter filter, boolean justActive, boolean hidePreFilters) {
    super(title, filter, RodaConstants.AIP_SEARCH,
      new AIPList(filter, justActive, DEFAULT_FACETS, messages.selectAipSearchResults(), SELECTABLE), hidePreFilters);

  }
}
