/********************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: (EPL-2.0 OR Apache-2.0)
 ********************************************************************************/

package org.eclipse.transformer.action.impl;

import org.eclipse.transformer.action.ActionType;
import org.slf4j.Logger;

public class RarActionImpl extends ContainerActionImpl {
	public RarActionImpl(Logger logger, InputBufferImpl buffer,
		SelectionRuleImpl selectionRule, SignatureRuleImpl signatureRule) {

		super(logger, buffer, selectionRule, signatureRule);
	}

	//

	@Override
	public String getName() {
		return "RAR Action";
	}

	@Override
	public ActionType getActionType() {
		return ActionType.RAR;
	}

	@Override
	public String getAcceptExtension() {
		return ".rar";
	}
}
