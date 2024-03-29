/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package demo;

/**
 * Created by JBoss Developer Studio
 *
 */
public class GetNameBean {
	String userName;

	/**
	 * @return User Name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param User Name
	 */
	public void setUserName(String name) {
		userName = name;
	}
}