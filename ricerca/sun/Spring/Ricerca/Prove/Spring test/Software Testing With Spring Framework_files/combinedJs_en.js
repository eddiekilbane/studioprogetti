var JSResource={
	presentationsTab : function() {
		ContentSummary.switchTab("PRESENTATION");
	},
	
	interviewsTab : function(){
		ContentSummary.switchTab("INTERVIEW");
	},
	
	minibooksTab : function(){
		ContentSummary.switchTab("MINIBOOK");
	}
};
JSResource.categoryManagement_showpopup_viewAllLink_viewAllPrefix="View All";
JSResource.categoryManagement_showpopup_viewAllLink_viewAllSuffix="";
JSResource.categoryManagement_showpopup_includeExcludeLink_Exclude="Exclude";
JSResource.categoryManagement_showpopup_includeExcludeLink_Include="Include";
JSResource.contentSummary_showPresentations_1="";
JSResource.contentSummary_showPresentations_2="";
JSResource.contentSummary_showPresentations_3="";
JSResource.contentSummary_showInterviews_1="";
JSResource.contentSummary_showInterviews_2="";
JSResource.contentSummary_showInterviews_3="";
JSResource.contentSummary_showMinibooks_1="";
JSResource.contentSummary_showMinibooks_2="";
JSResource.forum_view="View";
JSResource.forum_quoteOriginalMessage="Quote original message";
JSResource.forum_subject="Subject:";
JSResource.forum_yourReply="Your Reply:";
JSResource.forum_allowedHtml="Allowed html:";
JSResource.forum_notificationLabel1="Email me replies to any of";
JSResource.forum_notificationLabel2="my messages in this thread";
JSResource.login_showLoginWindow_existingUsers="Existing Users:";
JSResource.login_getRegister_newUsers="New Users:";
JSResource.login_getRegister_register="Register";
JSResource.login_getReactivationArea_resendActivation="Resend Activation:";
JSResource.login_getReactivationArea_resend="Resend";
JSResource.login_email="Email:";
JSResource.login_getResetPasswordArea_send="Send";
JSResource.login_getLoginArea_password="Password:";
JSResource.login_getLoginArea_login="Login";
JSResource.login_sendingRequest="Sending request ...";
JSResource.login_doResetPassword_sent="sent";
JSResource.login_doLogin_loginOK="Login ok";
JSResource.validateVendorContentForm_selectCountry="Please select your country.";
JSResource.validateVendorContentForm_enterEmail="Please enter your email.";
JSResource.validateVendorContentForm_enterValidEmailAddress="Please enter a valid email address.";
JSResource.validateVendorContentForm_enterPassword="Please enter your password.";
JSResource.validateVendorContentForm_repeatPassword="Please repeat your password.";
JSResource.validateVendorContentForm_enterFirstName="Please enter your first name.";
JSResource.validateVendorContentForm_enterLastName="Please enter your last name.";
JSResource.validateVendorContentForm_enterCompanyName="Please enter your company name.";
JSResource.validateVendorContentForm_selectRole="Please select your role."; 
JSResource.validateVendorContentForm_selectIndustry="Please select your industry."
JSResource.validateVendorContentForm_selectDevelopers="Please select the developers #.";
JSResource.validateVendorContentForm_enterAnswerToQuestion="Please enter the answer to this question.";
JSResource.close="Close";
JSResource.error="Error";
JSResource.search="Search";function trim(str) {
  	str = this != window? this : str;
  	str = str.replace(/^\s+/g, '').replace(/\s+$/g, '');
  	return str;
}

function escapeQuotes(str) {
	str = str.replace(/\"/g, '&quot;');
	return str;
}


function findPosX(obj)
{	
	var curleft = 0;
	if (obj.offsetParent)
	{
		while (obj.offsetParent)
		{
			curleft += obj.offsetLeft;
			obj = obj.offsetParent;
		}
	}
	else if (obj.x)
		curleft += obj.x;
	return curleft;
}

function findPosY(obj)
{
	var curtop = 0;
	if (obj.offsetParent)
	{
		while (obj.offsetParent)
		{
			curtop += obj.offsetTop;
			obj = obj.offsetParent;
		}
	}
	else if (obj.y)
		curtop += obj.y;
	return curtop;
}

function fullEscape(text) { 
	var encodedHtml = encodeURIComponent(text);
	return encodedHtml;
}

function createEmailAddress(hrefElem, domain) {
   var email= hrefElem.name;
   if(domain) { email=email+ "@" + domain;}
   else { email=email + "@infoq.com"};
   hrefElem.href= "mailto:" + email;
   return true;
}

var DWRErrorHandlerUtil = {
	imbrication : 0,
	
	setNoErrorReporterHandler : function() {
		DWREngine.setErrorHandler(function(message, ex) {});
		DWRErrorHandlerUtil.imbrication = DWRErrorHandlerUtil.imbrication + 1;
	},
	
	resetErrorHandler : function() {
		if (DWRErrorHandlerUtil.imbrication > 0) {
			DWRErrorHandlerUtil.imbrication = DWRErrorHandlerUtil.imbrication - 1;
		}
		if (DWRErrorHandlerUtil.imbrication == -1) {
			DWREngine.setErrorHandler(DWREngine.defaultMessageHandler);
		}
	}
}


/* WW-DWR */
var DWRActionUtil = {
	execute : function(action, values, callbackObjOrName, displayMessage) {
		var params= new Object();
		if (this.isElement(values)) {
			
			var element = this.getElement(values);
			var elementName= element.nodeName.toLowerCase();
			if (elementName == "input") {
				if(element.name != null && element.name != '') {
					params[element.name] = element.value;
				}
			}
			else if (elementName == 'form') {
	    		for (var i = 0; i < element.elements.length; i=i+1) {
	        		var e = element.elements[i];
            		if (e.name != null && e.name != '') {
                		params[e.name] = e.value;
            		}
        		}
			}
		}
		else {
			for(var prop in values) {
				params[prop]= values[prop];
			}
		}
		
		// prepare action invocation object
		var actionObj= {};
		if(typeof action == 'string') {
			var lastIdx= action.lastIndexOf('/');
			actionObj.executeResult= 'true';
			if(lastIdx != -1) {
				actionObj.namespace= action.substring(0, lastIdx);
				actionObj.action= action.substring(lastIdx + 1);
			}
			else {
				actionObj.namespace= '';
				actionObj.action= action;
			}
		}
		else {
			actionObj= action;
		}
		
		// prepare message if any
		var useMessage= false;
		if(displayMessage) {
			DWRUtil.useLoadingMessage(displayMessage);
			useMessage= true;
		}
		
		// prepare the DWR callback object
		var callbackObj = {};
		var originalCallback = {};
		var mustCall= false;
		if(typeof callbackObjOrName == 'string') {
			originalCallback.method = eval(callbackObjOrName);
			callbackObj.callback = function(dt) {
				try {
					if(dt.data) {
						originalCallback.method(dt.data);
					}
					else if(dt.text) {
						originalCallback.method(dt.text);
					}
					else {
						originalCallback.method(dt);
					}
				}
				finally {
					if(useMessage) {
						DWREngine.setPreHook(null);
						DWREngine.setPostHook(null);
					}
				}
			};
			mustCall= true;
		}
		else if(typeof callbackObjOrName == 'function') {
			originalCallback.method = callbackObjOrName;
			callbackObj.callback = function(dt) {
				try {
					if(dt.data) {
						originalCallback.method(dt.data);
					}
					else if(dt.text) {
						originalCallback.method(dt.text);
					}
					else {
						originalCallback.method(dt);
					}
				}
				finally {
					if(useMessage) {
						DWREngine.setPreHook(null);
						DWREngine.setPostHook(null);
					}
				}					
			};
			mustCall= true;
		} 
		else if(typeof callbackObjOrName == 'object' && typeof callbackObjOrName.callback == 'function') {
			for(var prop in callbackObjOrName) {
				callbackObj[prop]= callbackObjOrName[prop];
			}
			callbackObj.callback = function(dt) {
				try {
					if(dt.data) {
						callbackObjOrName.callback(dt.data);
					}
					else if(dt.text) {
						callbackObjOrName.callback(dt.text);
					}
					else {
						callbackObjOrName.callback(dt);
					}
				}
				finally {
					if(useMessage) {
						DWREngine.setPreHook(null);
						DWREngine.setPostHook(null);
					}
				}
			};
			mustCall= true;
		}
		if(mustCall) {
			DWRRewriteAction.execute(actionObj, params, callbackObj);
		}
	},
	
	isElement : function(elementOrId) {
		if (typeof elementOrId == "string") {
			return true;
		}
		if ( elementOrId.nodeName ) {
			var name= elementOrId.nodeName.toLowerCase();
			if(name == 'input' || name == 'form') {
				return true;
			}
		}
		
		return false;
	},
	
	getElement : function(elementOrId) {
		var elem;
		if (typeof elementOrId == "string") {
			elem = document.getElementById(elementOrId);
		}
		else {
			elem = elementOrId;
		}
		
		return elem;
	}
};

var Ads = {
	clickTextLink : function(anchor, tlId) {
		var dwrCallbackObj = {callback: function() {}};
		var params= {textLinkId: tlId, referrer: window.location.href};
		try {
			DWRActionUtil.execute({namespace: '/ads', action: 'trackTextLink', executeResult: 'false'}, params, dwrCallbackObj);
		} catch(err) {};
	},
	
	clickSkyscraper : function(anchor, skId) {
		var dwrCallbackObj = {callback: function() {}};
		var params= {skyscraperId: skId, referrer: window.location.href};
		try {
			DWRActionUtil.execute({namespace: '/ads', action: 'trackSkyscraper', executeResult: 'false'}, params, dwrCallbackObj);
		} catch(err) {};
	}
};

//Vendor content page
function showAreas(displayLoginArea, displayRegisterArea){
	var loginArea = document.getElementById('vcrloginarea');
	if(loginArea){
		loginArea.style.display = displayLoginArea;
	}
	var submitLoginArea = document.getElementById('submitLogin');
	if(submitLoginArea){
		submitLoginArea.style.display = displayLoginArea;
	}
	var registerArea = document.getElementById('registerarea');
	if(registerArea){
		registerArea.style.display=displayRegisterArea;
	}
	var registerAreaNote = document.getElementById('registerareanote');
	if(registerAreaNote){
		registerAreaNote.style.display=displayRegisterArea;
	}
	var submitRegisterArea = document.getElementById('submitRegister');
	if(submitRegisterArea){
		submitRegisterArea.style.display=displayRegisterArea;
	}
	
	// set the value for the action type field
	if(displayLoginArea == 'block'){
		var hiddenActionType = document.getElementById('actionType');
		if(hiddenActionType){
			hiddenActionType.value = 'login';
		}
	}

	if(displayRegisterArea == 'block'){
		var hiddenActionType = top.document.getElementById('actionType');
		if(hiddenActionType){
			hiddenActionType.value = 'register';
		}
	}
	
	// display the vendor content questions area
	var questionArea = document.getElementById('questionarea');
	if(questionArea){
		questionArea.style.display='block';
	}
	
	// display the "use my contact info" checkbox
	var contactInfoArea = document.getElementById('contactInfoArea');
	if(contactInfoArea){
		contactInfoArea.style.display=displayLoginArea;
	}
	
	// if user pressed login, hide the login button, if user pressed register, hide the register button
	var loginButton = document.getElementById('buttonLogin');
	if(loginButton){
		loginButton.style.display = displayRegisterArea;
	}
	var registerButton = document.getElementById('buttonRegister');
	if(registerButton){
		registerButton.style.display = displayLoginArea;
	}
}var ContentSummary = {
	language : "en",
	
	switchTab : function(tabName) {
		document.getElementById('selectedTab').value = tabName;
		document.getElementById('startIndex').value = '-99999';
		this.updateContent();
	},
	
	setLanguage : function(lang){
		this.language = lang;
	},
	
	setStartIndex : function(index) {
		document.getElementById('startIndex').value = index;
		this.updateContent();
	},

	updateBanner : function() {
		var langParams = {language: this.language};
		try {
			DWRActionUtil.execute({namespace: '/ads', action: 'skyscraper', executeResult: 'true'}, langParams, renderBanner);
		} catch(err) {};
	},

	updateAds : function() {
		var langParams = {language: this.language};
		try {
			if(document.getElementById('textlinksparagraph') != null) {
				DWRActionUtil.execute({namespace: '/ads', action: 'homepageads', executeResult: 'true'}, langParams, renderTextLinks);
			}
			if(document.getElementById('leftbartextlinks') != null) {
				DWRActionUtil.execute({namespace: '/ads', action: 'textlinks', executeResult: 'true'}, langParams, renderLeftbarTextLinks);
			}
		} catch(err) {};
	},

	updateContent : function() {
		DWRErrorHandlerUtil.setNoErrorReporterHandler();
		this.updateBanner();
		this.updateAds();

		try {
			DWRActionUtil.execute({namespace: '/', action: 'rightbar', executeResult: 'true'}, 'tabstateform', doOnResult, "Loading...");
		} catch(err) {};
	},

	setSelectedTab : function(lang) {
		if(lang) {
			this.language = lang;
		}
		var tabs = document.getElementById('tabsmenu').getElementsByTagName('LI');
		for(var i = 0; i < tabs.length; i++) {
			if(tabs[i].className.indexOf("-on") != -1) {
				tabs[i].className = tabs[i].className.replace(/-on/, "-off");
			}
		}
		// set the active one
		var selectedTabName = document.getElementById('selectedTab').value;
		document.getElementById('tab_' + selectedTabName).className = 'm-' + selectedTabName + '-on';
	}
};

/** tab content update */
function doOnResult(text) {
	if(text != "" && document.getElementById('rightbarcontentbox') != null) {
		document.getElementById('rightbarcontentbox').innerHTML = text;
		ContentSummary.setSelectedTab();
	}
	DWRErrorHandlerUtil.resetErrorHandler();
}
/** banner update */
function renderBanner(text) {
	if(text != "" && document.getElementById('bannerparagraph') != null) {
		document.getElementById('bannerparagraph').innerHTML = text;
	}
}
/** textlinks update */
function renderTextLinks(text) {
	if(text != "" && document.getElementById('textlinksparagraph') != null) {
		document.getElementById('textlinksparagraph').innerHTML = text;
	}
}
/** leftbar textlinks update */
function renderLeftbarTextLinks(text) {
	if(text != "" && document.getElementById('leftbartextlinks') != null) {
		document.getElementById('leftbartextlinks').innerHTML = text;
	}
}
function showPresentations() {
	document.getElementById('rightbarcontentbox').innerHTML =
		'<form id="tabstateform" action="">\r\n' +
		'\t<input id="startIndex" name="startIndex" value="0" type="hidden">\r\n' +
		'\t<input id="selectedTab" name="selectedTab" value="PRESENTATION" type="hidden">\r\n' +
		'\t<input id="rightBarLanguage" name="language" value="' + JSResource.LANG + '" type="hidden">\r\n' +
		'</form>\r\n' +
		'<div class="entry"><h1 class="ex-presentations">'+JSResource.contentSummary_showPresentations_1+'</h1>' +
		'<p>'+JSResource.contentSummary_showPresentations_2+'</p>' +
		'<p>'+JSResource.contentSummary_showPresentations_3+'</p>' +
		'</div>';
	ContentSummary.setSelectedTab(JSResource.LANG);
}
function showInterviews() {
	document.getElementById('rightbarcontentbox').innerHTML = 
		'<form id="tabstateform" action="">\r\n' +
		'\t<input id="startIndex" name="startIndex" value="0" type="hidden">\r\n' +
		'\t<input id="selectedTab" name="selectedTab" value="INTERVIEW" type="hidden">\r\n' +
		'\t<input id="rightBarLanguage" name="language" value="' + JSResource.LANG + '" type="hidden">\r\n' +
		'</form>\r\n' +
		'<div class="entry"><h1 class="ex-interviews">'+JSResource.contentSummary_showInterviews_1+'</h1>' +
		'<p>'+JSResource.contentSummary_showInterviews_2+'</p>' +
		'<p>'+JSResource.contentSummary_showInterviews_3+'</p>' +
		'</div>';
	ContentSummary.setSelectedTab(JSResource.LANG);	
}
function showMinibooks() {
	document.getElementById('rightbarcontentbox').innerHTML = 
		'<form id="tabstateform" action="">\r\n' +
		'\t<input id="startIndex" name="startIndex" value="0" type="hidden">\r\n' +
		'\t<input id="selectedTab" name="selectedTab" value="MINIBOOK" type="hidden">\r\n' +
		'\t<input id="rightBarLanguage" name="language" value="' + JSResource.LANG + '" type="hidden">\r\n' +
		'</form>\r\n' +
		'<div class="entry"><h1 class="ex-interviews">'+JSResource.contentSummary_showMinibooks_1+'</h1>' +
		'<p>'+JSResource.contentSummary_showMinibooks_2+'</p>' +
		'<ul>' +
		'<li>Scrum Checklists</li>' +
		'<li>Domain Driven Design Quickly</li>' +
		'<li>Visual Studio .NET Tips and Tricks</li>' +
		'</ul>' +
		'</div>';
	ContentSummary.setSelectedTab(JSResource.LANG);	
}var CategoryPopup = {
	showPopup : function(anchorElement) {
		var verticalPositionValue = findPosY(anchorElement) + anchorElement.offsetHeight-1;
		var verticalPosition = 'top: ' + verticalPositionValue + 'px;';
		var horizontalPosition = 'left: '+ findPosX(anchorElement)+ 'px;';
		var viewallLink = anchorElement.href;
		var popupInnerHtml= '<div id="innerTagPopup" class="popup tag-popup" style="display:none; z-index: 25550; position:absolute; '
				+ verticalPosition + ' ' +  horizontalPosition+' ">';
		popupInnerHtml += '<div class="popup-wrapper">';
		popupInnerHtml += '<p class="tag-popup-close"><a href="javascript:void(0);" onclick="CategoryPopup.hidePopup();return false;"></a></p>';
		popupInnerHtml += '<div id="categoryPopupFeedback" style="display: none">';
		popupInnerHtml += '<img id="categoryPopupImg" src="' + contextPath + 'images/miniglobe.gif" />';
		popupInnerHtml += '<small class="red" id="categoryPopupMsg"> ' + busyMessage + '</small>';
		popupInnerHtml += '</div>';
		popupInnerHtml += '<A id="popupViewAll" HREF="' + viewallLink + '">'+ JSResource.categoryManagement_showpopup_viewAllLink_viewAllPrefix +' '+ anchorElement.innerHTML + JSResource.categoryManagement_showpopup_viewAllLink_viewAllSuffix + '</A>';
		popupInnerHtml += '<BR/><SMALL>' + viewallCategoryMessage + '</SMALL>';
		if(includeExcludeLink) {
			popupInnerHtml += '<BR/>';
			if(anchorElement.excluded!=true){
				popupInnerHtml += '<A id="popupIncludeExclude" HREF="javascript:void(0);" onClick="excludeCategory(\'' + anchorElement.id + '\',\'' + anchorElement.name + '\'); return false;">'+JSResource.categoryManagement_showpopup_includeExcludeLink_Exclude+'</A>';
				popupInnerHtml += '<BR/><SMALL id="popupIncludeExcludeMsg">' + excludeHint + '</SMALL>';
			} else {
				popupInnerHtml += '<A id="popupIncludeExclude" HREF="javascript:void(0);" onClick="includeCategory(\'' + anchorElement.id + '\',\'' + anchorElement.name + '\'); return false;">'+JSResource.categoryManagement_showpopup_includeExcludeLink_Include+'</A>';
				popupInnerHtml += '<BR/><SMALL id="popupIncludeExcludeMsg">' + includeHint + '</SMALL>';
			}
		}
		popupInnerHtml += '</div></div>';

		Element.update('tagPopup', popupInnerHtml);				
		Element.show('tagPopup');
		Element.show('innerTagPopup');
	},
	
	hidePopup : function() {
	   if(document.getElementById('innerTagPopup')){
	       Element.hide('innerTagPopup');
	   }
	   if(document.getElementById('tagPopup')){
	       Element.hide('tagPopup');
	   }
	}
};

function markExcluded(name, id){
	var anchors = document.getElementsByTagName('a');
	for(var i=0;i<anchors.length;i++){
		var text = null;
		if(anchors[i].text) text = anchors[i].text;
		if(anchors[i].innerText) text = anchors[i].innerText;
		if(text == name){
			anchors[i].style.textDecoration='line-through';
			anchors[i].excluded = true;
		}
	}
	//update the top-left widget community
	var element = document.getElementById("community"+id);
	if(element){
		element.disabled = false;
		element.checked=false;
	}
}
		
function markIncluded(name, id){
	var anchors = document.getElementsByTagName('a');
	for(var i=0;i<anchors.length;i++){
		var text = null;
		if(anchors[i].text) text = anchors[i].text;
		if(anchors[i].innerText) text = anchors[i].innerText;
		if(text == name){
			anchors[i].style.textDecoration='none';
			anchors[i].excluded = false;
		}
	}
	//update the top-left widget community
	var element = document.getElementById("community"+id);
	if(element){
		element.disabled = false;
		element.checked=true;
	}
}
		
function excludeCategory(categoryId, categoryName){
	var feedback = document.getElementById('categoryPopupFeedback');
	feedback.style.display = 'block';
	UserCategoryUtil.excludeCategory(categoryId, updateExcludedCategories);
}

function excludeCommunity(categoryId){
	UserCategoryUtil.excludeCategory(categoryId, updateExcludedCategories);
}

var updateExcludedCategories = function(name) {
	CategoryPopup.hidePopup();
	DWRErrorHandlerUtil.resetErrorHandler();
	var catInfo = name.split("-");
	if(catInfo){
		markExcluded(catInfo[0], catInfo[1]);
	}
}

function includeCategory(categoryId, index){
	var feedback = document.getElementById('categoryPopupFeedback');
	feedback.style.display = 'block';
	UserCategoryUtil.includeCategory(categoryId, updateIncludedCategories);
}
		
function includeCommunity(categoryId){
	UserCategoryUtil.includeCategory(categoryId, updateIncludedCategories);
}

var updateIncludedCategories = function(name) {
	CategoryPopup.hidePopup();
	DWRErrorHandlerUtil.resetErrorHandler();
	var catInfo = name.split("-");
	if(catInfo){
		markIncluded(catInfo[0], catInfo[1]);
	}
}
				
function includeExcludeCommunity(checkbox) {
    if(!checkbox.disabled){
		var commId = checkbox.id;
		commId = commId.replace(/community/,"");
		checkbox.disabled = true;
		DWRErrorHandlerUtil.setNoErrorReporterHandler();
		if(checkbox.checked){
			includeCommunity(commId);
		} else {
			excludeCommunity(commId);
		}
		var communitiesMessageArea = document.getElementById("communitiesMessage");
		if(communitiesMessageArea){
			communitiesMessageArea.innerHTML = '<small style="color: grey;">'+communityChangeMessage+'</small>';
		}
	}
}/*  Prototype JavaScript framework, version 1.4.0
 *  (c) 2005 Sam Stephenson <sam@conio.net>
 *
 *  THIS FILE IS AUTOMATICALLY GENERATED. When sending patches, please diff
 *  against the source tree, available from the Prototype darcs repository.
 *
 *  Prototype is freely distributable under the terms of an MIT-style license.
 *
 *  For details, see the Prototype web site: http://prototype.conio.net/
 *
/*--------------------------------------------------------------------------*/

var Prototype = {
  Version: '1.4.0',
  ScriptFragment: '(?:<script.*?>)((\n|\r|.)*?)(?:<\/script>)',

  emptyFunction: function() {},
  K: function(x) {return x}
}

var Class = {
  create: function() {
    return function() {
      this.initialize.apply(this, arguments);
    }
  }
}

var Abstract = new Object();

Object.extend = function(destination, source) {
  for (property in source) {
    destination[property] = source[property];
  }
  return destination;
}

Object.inspect = function(object) {
  try {
    if (object == undefined) return 'undefined';
    if (object == null) return 'null';
    return object.inspect ? object.inspect() : object.toString();
  } catch (e) {
    if (e instanceof RangeError) return '...';
    throw e;
  }
}

Function.prototype.bind = function() {
  var __method = this, args = $A(arguments), object = args.shift();
  return function() {
    return __method.apply(object, args.concat($A(arguments)));
  }
}

Function.prototype.bindAsEventListener = function(object) {
  var __method = this;
  return function(event) {
    return __method.call(object, event || window.event);
  }
}

Object.extend(Number.prototype, {
  toColorPart: function() {
    var digits = this.toString(16);
    if (this < 16) return '0' + digits;
    return digits;
  },

  succ: function() {
    return this + 1;
  },

  times: function(iterator) {
    $R(0, this, true).each(iterator);
    return this;
  }
});

var Try = {
  these: function() {
    var returnValue;

    for (var i = 0; i < arguments.length; i++) {
      var lambda = arguments[i];
      try {
        returnValue = lambda();
        break;
      } catch (e) {}
    }

    return returnValue;
  }
}

/*--------------------------------------------------------------------------*/

var PeriodicalExecuter = Class.create();
PeriodicalExecuter.prototype = {
  initialize: function(callback, frequency) {
    this.callback = callback;
    this.frequency = frequency;
    this.currentlyExecuting = false;

    this.registerCallback();
  },

  registerCallback: function() {
    setInterval(this.onTimerEvent.bind(this), this.frequency * 1000);
  },

  onTimerEvent: function() {
    if (!this.currentlyExecuting) {
      try {
        this.currentlyExecuting = true;
        this.callback();
      } finally {
        this.currentlyExecuting = false;
      }
    }
  }
}

/*--------------------------------------------------------------------------*/

function $() {
  var elements = new Array();

  for (var i = 0; i < arguments.length; i++) {
    var element = arguments[i];
    if (typeof element == 'string')
      element = document.getElementById(element);

    if (arguments.length == 1)
      return element;

    elements.push(element);
  }

  return elements;
}
Object.extend(String.prototype, {
  stripTags: function() {
    return this.replace(/<\/?[^>]+>/gi, '');
  },

  stripScripts: function() {
    return this.replace(new RegExp(Prototype.ScriptFragment, 'img'), '');
  },

  extractScripts: function() {
    var matchAll = new RegExp(Prototype.ScriptFragment, 'img');
    var matchOne = new RegExp(Prototype.ScriptFragment, 'im');
    return (this.match(matchAll) || []).map(function(scriptTag) {
      return (scriptTag.match(matchOne) || ['', ''])[1];
    });
  },

  evalScripts: function() {
    return this.extractScripts().map(eval);
  },

  escapeHTML: function() {
    var div = document.createElement('div');
    var text = document.createTextNode(this);
    div.appendChild(text);
    return div.innerHTML;
  },

  unescapeHTML: function() {
    var div = document.createElement('div');
    div.innerHTML = this.stripTags();
    return div.childNodes[0] ? div.childNodes[0].nodeValue : '';
  },

  toQueryParams: function() {
    var pairs = this.match(/^\??(.*)$/)[1].split('&');
    return pairs.inject({}, function(params, pairString) {
      var pair = pairString.split('=');
      params[pair[0]] = pair[1];
      return params;
    });
  },

  toArray: function() {
    return this.split('');
  },

  camelize: function() {
    var oStringList = this.split('-');
    if (oStringList.length == 1) return oStringList[0];

    var camelizedString = this.indexOf('-') == 0
      ? oStringList[0].charAt(0).toUpperCase() + oStringList[0].substring(1)
      : oStringList[0];

    for (var i = 1, len = oStringList.length; i < len; i++) {
      var s = oStringList[i];
      camelizedString += s.charAt(0).toUpperCase() + s.substring(1);
    }

    return camelizedString;
  },

  inspect: function() {
    return "'" + this.replace('\\', '\\\\').replace("'", '\\\'') + "'";
  }
});

String.prototype.parseQuery = String.prototype.toQueryParams;

var $break    = new Object();
var $continue = new Object();

var Enumerable = {
  each: function(iterator) {
    var index = 0;
    try {
      this._each(function(value) {
        try {
          iterator(value, index++);
        } catch (e) {
          if (e != $continue) throw e;
        }
      });
    } catch (e) {
      if (e != $break) throw e;
    }
  },

  all: function(iterator) {
    var result = true;
    this.each(function(value, index) {
      result = result && !!(iterator || Prototype.K)(value, index);
      if (!result) throw $break;
    });
    return result;
  },

  any: function(iterator) {
    var result = true;
    this.each(function(value, index) {
      if (result = !!(iterator || Prototype.K)(value, index))
        throw $break;
    });
    return result;
  },

  collect: function(iterator) {
    var results = [];
    this.each(function(value, index) {
      results.push(iterator(value, index));
    });
    return results;
  },

  detect: function (iterator) {
    var result;
    this.each(function(value, index) {
      if (iterator(value, index)) {
        result = value;
        throw $break;
      }
    });
    return result;
  },

  findAll: function(iterator) {
    var results = [];
    this.each(function(value, index) {
      if (iterator(value, index))
        results.push(value);
    });
    return results;
  },

  grep: function(pattern, iterator) {
    var results = [];
    this.each(function(value, index) {
      var stringValue = value.toString();
      if (stringValue.match(pattern))
        results.push((iterator || Prototype.K)(value, index));
    })
    return results;
  },

  include: function(object) {
    var found = false;
    this.each(function(value) {
      if (value == object) {
        found = true;
        throw $break;
      }
    });
    return found;
  },

  inject: function(memo, iterator) {
    this.each(function(value, index) {
      memo = iterator(memo, value, index);
    });
    return memo;
  },

  invoke: function(method) {
    var args = $A(arguments).slice(1);
    return this.collect(function(value) {
      return value[method].apply(value, args);
    });
  },

  max: function(iterator) {
    var result;
    this.each(function(value, index) {
      value = (iterator || Prototype.K)(value, index);
      if (value >= (result || value))
        result = value;
    });
    return result;
  },

  min: function(iterator) {
    var result;
    this.each(function(value, index) {
      value = (iterator || Prototype.K)(value, index);
      if (value <= (result || value))
        result = value;
    });
    return result;
  },

  partition: function(iterator) {
    var trues = [], falses = [];
    this.each(function(value, index) {
      ((iterator || Prototype.K)(value, index) ?
        trues : falses).push(value);
    });
    return [trues, falses];
  },

  pluck: function(property) {
    var results = [];
    this.each(function(value, index) {
      results.push(value[property]);
    });
    return results;
  },

  reject: function(iterator) {
    var results = [];
    this.each(function(value, index) {
      if (!iterator(value, index))
        results.push(value);
    });
    return results;
  },

  sortBy: function(iterator) {
    return this.collect(function(value, index) {
      return {value: value, criteria: iterator(value, index)};
    }).sort(function(left, right) {
      var a = left.criteria, b = right.criteria;
      return a < b ? -1 : a > b ? 1 : 0;
    }).pluck('value');
  },

  toArray: function() {
    return this.collect(Prototype.K);
  },

  zip: function() {
    var iterator = Prototype.K, args = $A(arguments);
    if (typeof args.last() == 'function')
      iterator = args.pop();

    var collections = [this].concat(args).map($A);
    return this.map(function(value, index) {
      iterator(value = collections.pluck(index));
      return value;
    });
  },

  inspect: function() {
    return '#<Enumerable:' + this.toArray().inspect() + '>';
  }
}

Object.extend(Enumerable, {
  map:     Enumerable.collect,
  find:    Enumerable.detect,
  select:  Enumerable.findAll,
  member:  Enumerable.include,
  entries: Enumerable.toArray
});
var $A = Array.from = function(iterable) {
  if (!iterable) return [];
  if (iterable.toArray) {
    return iterable.toArray();
  } else {
    var results = [];
    for (var i = 0; i < iterable.length; i++)
      results.push(iterable[i]);
    return results;
  }
}

Object.extend(Array.prototype, Enumerable);

Array.prototype._reverse = Array.prototype.reverse;

Object.extend(Array.prototype, {
  _each: function(iterator) {
    for (var i = 0; i < this.length; i++)
      iterator(this[i]);
  },

  clear: function() {
    this.length = 0;
    return this;
  },

  first: function() {
    return this[0];
  },

  last: function() {
    return this[this.length - 1];
  },

  compact: function() {
    return this.select(function(value) {
      return value != undefined || value != null;
    });
  },

  flatten: function() {
    return this.inject([], function(array, value) {
      return array.concat(value.constructor == Array ?
        value.flatten() : [value]);
    });
  },

  without: function() {
    var values = $A(arguments);
    return this.select(function(value) {
      return !values.include(value);
    });
  },

  indexOf: function(object) {
    for (var i = 0; i < this.length; i++)
      if (this[i] == object) return i;
    return -1;
  },

  reverse: function(inline) {
    return (inline !== false ? this : this.toArray())._reverse();
  },

  shift: function() {
    var result = this[0];
    for (var i = 0; i < this.length - 1; i++)
      this[i] = this[i + 1];
    this.length--;
    return result;
  },

  inspect: function() {
    return '[' + this.map(Object.inspect).join(', ') + ']';
  }
});
var Hash = {
  _each: function(iterator) {
    for (key in this) {
      var value = this[key];
      if (typeof value == 'function') continue;

      var pair = [key, value];
      pair.key = key;
      pair.value = value;
      iterator(pair);
    }
  },

  keys: function() {
    return this.pluck('key');
  },

  values: function() {
    return this.pluck('value');
  },

  merge: function(hash) {
    return $H(hash).inject($H(this), function(mergedHash, pair) {
      mergedHash[pair.key] = pair.value;
      return mergedHash;
    });
  },

  toQueryString: function() {
    return this.map(function(pair) {
      return pair.map(encodeURIComponent).join('=');
    }).join('&');
  },

  inspect: function() {
    return '#<Hash:{' + this.map(function(pair) {
      return pair.map(Object.inspect).join(': ');
    }).join(', ') + '}>';
  }
}

function $H(object) {
  var hash = Object.extend({}, object || {});
  Object.extend(hash, Enumerable);
  Object.extend(hash, Hash);
  return hash;
}
ObjectRange = Class.create();
Object.extend(ObjectRange.prototype, Enumerable);
Object.extend(ObjectRange.prototype, {
  initialize: function(start, end, exclusive) {
    this.start = start;
    this.end = end;
    this.exclusive = exclusive;
  },

  _each: function(iterator) {
    var value = this.start;
    do {
      iterator(value);
      value = value.succ();
    } while (this.include(value));
  },

  include: function(value) {
    if (value < this.start)
      return false;
    if (this.exclusive)
      return value < this.end;
    return value <= this.end;
  }
});

var $R = function(start, end, exclusive) {
  return new ObjectRange(start, end, exclusive);
}

var Ajax = {
  getTransport: function() {
    return Try.these(
      function() {return new ActiveXObject('Msxml2.XMLHTTP')},
      function() {return new ActiveXObject('Microsoft.XMLHTTP')},
      function() {return new XMLHttpRequest()}
    ) || false;
  },

  activeRequestCount: 0
}

Ajax.Responders = {
  responders: [],

  _each: function(iterator) {
    this.responders._each(iterator);
  },

  register: function(responderToAdd) {
    if (!this.include(responderToAdd))
      this.responders.push(responderToAdd);
  },

  unregister: function(responderToRemove) {
    this.responders = this.responders.without(responderToRemove);
  },

  dispatch: function(callback, request, transport, json) {
    this.each(function(responder) {
      if (responder[callback] && typeof responder[callback] == 'function') {
        try {
          responder[callback].apply(responder, [request, transport, json]);
        } catch (e) {}
      }
    });
  }
};

Object.extend(Ajax.Responders, Enumerable);

Ajax.Responders.register({
  onCreate: function() {
    Ajax.activeRequestCount++;
  },

  onComplete: function() {
    Ajax.activeRequestCount--;
  }
});

Ajax.Base = function() {};
Ajax.Base.prototype = {
  setOptions: function(options) {
    this.options = {
      method:       'post',
      asynchronous: true,
      parameters:   ''
    }
    Object.extend(this.options, options || {});
  },

  responseIsSuccess: function() {
    return this.transport.status == undefined
        || this.transport.status == 0
        || (this.transport.status >= 200 && this.transport.status < 300);
  },

  responseIsFailure: function() {
    return !this.responseIsSuccess();
  }
}

Ajax.Request = Class.create();
Ajax.Request.Events =
  ['Uninitialized', 'Loading', 'Loaded', 'Interactive', 'Complete'];

Ajax.Request.prototype = Object.extend(new Ajax.Base(), {
  initialize: function(url, options) {
    this.transport = Ajax.getTransport();
    this.setOptions(options);
    this.request(url);
  },

  request: function(url) {
    var parameters = this.options.parameters || '';
    //if (parameters.length > 0) parameters += '&_=';

    try {
      this.url = url;
      if (this.options.method == 'get' && parameters.length > 0)
        this.url += (this.url.match(/\?/) ? '&' : '?') + parameters;

      Ajax.Responders.dispatch('onCreate', this, this.transport);

      this.transport.open(this.options.method, this.url,
        this.options.asynchronous);

      if (this.options.asynchronous) {
        this.transport.onreadystatechange = this.onStateChange.bind(this);
        setTimeout((function() {this.respondToReadyState(1)}).bind(this), 10);
      }

      this.setRequestHeaders();

      var body = this.options.postBody ? this.options.postBody : parameters;
      this.transport.send(this.options.method == 'post' ? body : null);

    } catch (e) {
      this.dispatchException(e);
    }
  },

  setRequestHeaders: function() {
    var requestHeaders =
      ['X-Requested-With', 'XMLHttpRequest',
       'X-Prototype-Version', Prototype.Version];

    if (this.options.method == 'post') {
      requestHeaders.push('Content-type',
        'application/x-www-form-urlencoded');

      /* Force "Connection: close" for Mozilla browsers to work around
       * a bug where XMLHttpReqeuest sends an incorrect Content-length
       * header. See Mozilla Bugzilla #246651.
       */
      if (this.transport.overrideMimeType)
        requestHeaders.push('Connection', 'close');
    }

    if (this.options.requestHeaders)
      requestHeaders.push.apply(requestHeaders, this.options.requestHeaders);

    for (var i = 0; i < requestHeaders.length; i += 2)
      this.transport.setRequestHeader(requestHeaders[i], requestHeaders[i+1]);
  },

  onStateChange: function() {
    var readyState = this.transport.readyState;
    if (readyState != 1)
      this.respondToReadyState(this.transport.readyState);
  },

  header: function(name) {
    try {
      return this.transport.getResponseHeader(name);
    } catch (e) {}
  },

  evalJSON: function() {
    try {
      return eval(this.header('X-JSON'));
    } catch (e) {}
  },

  evalResponse: function() {
    try {
      return eval(this.transport.responseText);
    } catch (e) {
      this.dispatchException(e);
    }
  },

  respondToReadyState: function(readyState) {
    var event = Ajax.Request.Events[readyState];
    var transport = this.transport, json = this.evalJSON();

    if (event == 'Complete') {
      try {
        (this.options['on' + this.transport.status]
         || this.options['on' + (this.responseIsSuccess() ? 'Success' : 'Failure')]
         || Prototype.emptyFunction)(transport, json);
      } catch (e) {
        this.dispatchException(e);
      }

      if ((this.header('Content-type') || '').match(/^text\/javascript/i))
        this.evalResponse();
    }

    try {
      (this.options['on' + event] || Prototype.emptyFunction)(transport, json);
      Ajax.Responders.dispatch('on' + event, this, transport, json);
    } catch (e) {
      this.dispatchException(e);
    }

    /* Avoid memory leak in MSIE: clean up the oncomplete event handler */
    if (event == 'Complete')
      this.transport.onreadystatechange = Prototype.emptyFunction;
  },

  dispatchException: function(exception) {
    (this.options.onException || Prototype.emptyFunction)(this, exception);
    Ajax.Responders.dispatch('onException', this, exception);
  }
});

Ajax.Updater = Class.create();

Object.extend(Object.extend(Ajax.Updater.prototype, Ajax.Request.prototype), {
  initialize: function(container, url, options) {
    this.containers = {
      success: container.success ? $(container.success) : $(container),
      failure: container.failure ? $(container.failure) :
        (container.success ? null : $(container))
    }

    this.transport = Ajax.getTransport();
    this.setOptions(options);

    var onComplete = this.options.onComplete || Prototype.emptyFunction;
    this.options.onComplete = (function(transport, object) {
      this.updateContent();
      onComplete(transport, object);
    }).bind(this);

    this.request(url);
  },

  updateContent: function() {
    var receiver = this.responseIsSuccess() ?
      this.containers.success : this.containers.failure;
    var response = this.transport.responseText;

    if (!this.options.evalScripts)
      response = response.stripScripts();

    if (receiver) {
      if (this.options.insertion) {
        new this.options.insertion(receiver, response);
      } else {
        Element.update(receiver, response);
      }
    }

    if (this.responseIsSuccess()) {
      if (this.onComplete)
        setTimeout(this.onComplete.bind(this), 10);
    }
  }
});

Ajax.PeriodicalUpdater = Class.create();
Ajax.PeriodicalUpdater.prototype = Object.extend(new Ajax.Base(), {
  initialize: function(container, url, options) {
    this.setOptions(options);
    this.onComplete = this.options.onComplete;

    this.frequency = (this.options.frequency || 2);
    this.decay = (this.options.decay || 1);

    this.updater = {};
    this.container = container;
    this.url = url;

    this.start();
  },

  start: function() {
    this.options.onComplete = this.updateComplete.bind(this);
    this.onTimerEvent();
  },

  stop: function() {
    this.updater.onComplete = undefined;
    clearTimeout(this.timer);
    (this.onComplete || Prototype.emptyFunction).apply(this, arguments);
  },

  updateComplete: function(request) {
    if (this.options.decay) {
      this.decay = (request.responseText == this.lastText ?
        this.decay * this.options.decay : 1);

      this.lastText = request.responseText;
    }
    this.timer = setTimeout(this.onTimerEvent.bind(this),
      this.decay * this.frequency * 1000);
  },

  onTimerEvent: function() {
    this.updater = new Ajax.Updater(this.container, this.url, this.options);
  }
});
document.getElementsByClassName = function(className, parentElement) {
  var children = ($(parentElement) || document.body).getElementsByTagName('*');
  return $A(children).inject([], function(elements, child) {
    if (child.className.match(new RegExp("(^|\\s)" + className + "(\\s|$)")))
      elements.push(child);
    return elements;
  });
}

/*--------------------------------------------------------------------------*/

if (!window.Element) {
  var Element = new Object();
}

Object.extend(Element, {
  visible: function(element) {
    return $(element).style.display != 'none';
  },

  toggle: function() {
    for (var i = 0; i < arguments.length; i++) {
      var element = $(arguments[i]);
      Element[Element.visible(element) ? 'hide' : 'show'](element);
    }
  },

  hide: function() {
    for (var i = 0; i < arguments.length; i++) {
      var element = $(arguments[i]);
      element.style.display = 'none';
    }
  },

  show: function() {
    for (var i = 0; i < arguments.length; i++) {
      var element = $(arguments[i]);
      element.style.display = '';
    }
  },

  remove: function(element) {
    element = $(element);
    element.parentNode.removeChild(element);
  },

  update: function(element, html) {
    $(element).innerHTML = html.stripScripts();
    setTimeout(function() {html.evalScripts()}, 10);
  },

  getHeight: function(element) {
    element = $(element);
    return element.offsetHeight;
  },

  classNames: function(element) {
    return new Element.ClassNames(element);
  },

  hasClassName: function(element, className) {
    if (!(element = $(element))) return;
    return Element.classNames(element).include(className);
  },

  addClassName: function(element, className) {
    if (!(element = $(element))) return;
    return Element.classNames(element).add(className);
  },

  removeClassName: function(element, className) {
    if (!(element = $(element))) return;
    return Element.classNames(element).remove(className);
  },

  // removes whitespace-only text node children
  cleanWhitespace: function(element) {
    element = $(element);
    for (var i = 0; i < element.childNodes.length; i++) {
      var node = element.childNodes[i];
      if (node.nodeType == 3 && !/\S/.test(node.nodeValue))
        Element.remove(node);
    }
  },

  empty: function(element) {
    return $(element).innerHTML.match(/^\s*$/);
  },

  scrollTo: function(element) {
    element = $(element);
    var x = element.x ? element.x : element.offsetLeft,
        y = element.y ? element.y : element.offsetTop;
    window.scrollTo(x, y);
  },

  getStyle: function(element, style) {
    element = $(element);
    var value = element.style[style.camelize()];
    if (!value) {
      if (document.defaultView && document.defaultView.getComputedStyle) {
        var css = document.defaultView.getComputedStyle(element, null);
        value = css ? css.getPropertyValue(style) : null;
      } else if (element.currentStyle) {
        value = element.currentStyle[style.camelize()];
      }
    }

    if (window.opera && ['left', 'top', 'right', 'bottom'].include(style))
      if (Element.getStyle(element, 'position') == 'static') value = 'auto';

    return value == 'auto' ? null : value;
  },

  setStyle: function(element, style) {
    element = $(element);
    for (name in style)
      element.style[name.camelize()] = style[name];
  },

  getDimensions: function(element) {
    element = $(element);
    if (Element.getStyle(element, 'display') != 'none')
      return {width: element.offsetWidth, height: element.offsetHeight};

    // All *Width and *Height properties give 0 on elements with display none,
    // so enable the element temporarily
    var els = element.style;
    var originalVisibility = els.visibility;
    var originalPosition = els.position;
    els.visibility = 'hidden';
    els.position = 'absolute';
    els.display = '';
    var originalWidth = element.clientWidth;
    var originalHeight = element.clientHeight;
    els.display = 'none';
    els.position = originalPosition;
    els.visibility = originalVisibility;
    return {width: originalWidth, height: originalHeight};
  },

  makePositioned: function(element) {
    element = $(element);
    var pos = Element.getStyle(element, 'position');
    if (pos == 'static' || !pos) {
      element._madePositioned = true;
      element.style.position = 'relative';
      // Opera returns the offset relative to the positioning context, when an
      // element is position relative but top and left have not been defined
      if (window.opera) {
        element.style.top = 0;
        element.style.left = 0;
      }
    }
  },

  undoPositioned: function(element) {
    element = $(element);
    if (element._madePositioned) {
      element._madePositioned = undefined;
      element.style.position =
        element.style.top =
        element.style.left =
        element.style.bottom =
        element.style.right = '';
    }
  },

  makeClipping: function(element) {
    element = $(element);
    if (element._overflow) return;
    element._overflow = element.style.overflow;
    if ((Element.getStyle(element, 'overflow') || 'visible') != 'hidden')
      element.style.overflow = 'hidden';
  },

  undoClipping: function(element) {
    element = $(element);
    if (element._overflow) return;
    element.style.overflow = element._overflow;
    element._overflow = undefined;
  }
});

var Toggle = new Object();
Toggle.display = Element.toggle;

/*--------------------------------------------------------------------------*/

Abstract.Insertion = function(adjacency) {
  this.adjacency = adjacency;
}

Abstract.Insertion.prototype = {
  initialize: function(element, content) {
    this.element = $(element);
    this.content = content.stripScripts();

    if (this.adjacency && this.element.insertAdjacentHTML) {
      try {
        this.element.insertAdjacentHTML(this.adjacency, this.content);
      } catch (e) {
        if (this.element.tagName.toLowerCase() == 'tbody') {
          this.insertContent(this.contentFromAnonymousTable());
        } else {
          throw e;
        }
      }
    } else {
      this.range = this.element.ownerDocument.createRange();
      if (this.initializeRange) this.initializeRange();
      this.insertContent([this.range.createContextualFragment(this.content)]);
    }

    setTimeout(function() {content.evalScripts()}, 10);
  },

  contentFromAnonymousTable: function() {
    var div = document.createElement('div');
    div.innerHTML = '<table><tbody>' + this.content + '</tbody></table>';
    return $A(div.childNodes[0].childNodes[0].childNodes);
  }
}

var Insertion = new Object();

Insertion.Before = Class.create();
Insertion.Before.prototype = Object.extend(new Abstract.Insertion('beforeBegin'), {
  initializeRange: function() {
    this.range.setStartBefore(this.element);
  },

  insertContent: function(fragments) {
    fragments.each((function(fragment) {
      this.element.parentNode.insertBefore(fragment, this.element);
    }).bind(this));
  }
});

Insertion.Top = Class.create();
Insertion.Top.prototype = Object.extend(new Abstract.Insertion('afterBegin'), {
  initializeRange: function() {
    this.range.selectNodeContents(this.element);
    this.range.collapse(true);
  },

  insertContent: function(fragments) {
    fragments.reverse(false).each((function(fragment) {
      this.element.insertBefore(fragment, this.element.firstChild);
    }).bind(this));
  }
});

Insertion.Bottom = Class.create();
Insertion.Bottom.prototype = Object.extend(new Abstract.Insertion('beforeEnd'), {
  initializeRange: function() {
    this.range.selectNodeContents(this.element);
    this.range.collapse(this.element);
  },

  insertContent: function(fragments) {
    fragments.each((function(fragment) {
      this.element.appendChild(fragment);
    }).bind(this));
  }
});

Insertion.After = Class.create();
Insertion.After.prototype = Object.extend(new Abstract.Insertion('afterEnd'), {
  initializeRange: function() {
    this.range.setStartAfter(this.element);
  },

  insertContent: function(fragments) {
    fragments.each((function(fragment) {
      this.element.parentNode.insertBefore(fragment,
        this.element.nextSibling);
    }).bind(this));
  }
});

/*--------------------------------------------------------------------------*/

Element.ClassNames = Class.create();
Element.ClassNames.prototype = {
  initialize: function(element) {
    this.element = $(element);
  },

  _each: function(iterator) {
    this.element.className.split(/\s+/).select(function(name) {
      return name.length > 0;
    })._each(iterator);
  },

  set: function(className) {
    this.element.className = className;
  },

  add: function(classNameToAdd) {
    if (this.include(classNameToAdd)) return;
    this.set(this.toArray().concat(classNameToAdd).join(' '));
  },

  remove: function(classNameToRemove) {
    if (!this.include(classNameToRemove)) return;
    this.set(this.select(function(className) {
      return className != classNameToRemove;
    }).join(' '));
  },

  toString: function() {
    return this.toArray().join(' ');
  }
}

Object.extend(Element.ClassNames.prototype, Enumerable);
var Field = {
  clear: function() {
    for (var i = 0; i < arguments.length; i++)
      $(arguments[i]).value = '';
  },

  focus: function(element) {
    $(element).focus();
  },

  present: function() {
    for (var i = 0; i < arguments.length; i++)
      if ($(arguments[i]).value == '') return false;
    return true;
  },

  select: function(element) {
    $(element).select();
  },

  activate: function(element) {
    element = $(element);
    element.focus();
    if (element.select)
      element.select();
  }
}

/*--------------------------------------------------------------------------*/

var Form = {
  serialize: function(form) {
    var elements = Form.getElements($(form));
    var queryComponents = new Array();

    for (var i = 0; i < elements.length; i++) {
      var queryComponent = Form.Element.serialize(elements[i]);
      if (queryComponent)
        queryComponents.push(queryComponent);
    }

    return queryComponents.join('&');
  },

  getElements: function(form) {
    form = $(form);
    var elements = new Array();

    for (tagName in Form.Element.Serializers) {
      var tagElements = form.getElementsByTagName(tagName);
      for (var j = 0; j < tagElements.length; j++)
        elements.push(tagElements[j]);
    }
    return elements;
  },

  getInputs: function(form, typeName, name) {
    form = $(form);
    var inputs = form.getElementsByTagName('input');

    if (!typeName && !name)
      return inputs;

    var matchingInputs = new Array();
    for (var i = 0; i < inputs.length; i++) {
      var input = inputs[i];
      if ((typeName && input.type != typeName) ||
          (name && input.name != name))
        continue;
      matchingInputs.push(input);
    }

    return matchingInputs;
  },

  disable: function(form) {
    var elements = Form.getElements(form);
    for (var i = 0; i < elements.length; i++) {
      var element = elements[i];
      element.blur();
      element.disabled = 'true';
    }
  },

  enable: function(form) {
    var elements = Form.getElements(form);
    for (var i = 0; i < elements.length; i++) {
      var element = elements[i];
      element.disabled = '';
    }
  },

  findFirstElement: function(form) {
    return Form.getElements(form).find(function(element) {
      return element.type != 'hidden' && !element.disabled &&
        ['input', 'select', 'textarea'].include(element.tagName.toLowerCase());
    });
  },

  focusFirstElement: function(form) {
    Field.activate(Form.findFirstElement(form));
  },

  reset: function(form) {
    $(form).reset();
  }
}

Form.Element = {
  serialize: function(element) {
    element = $(element);
    var method = element.tagName.toLowerCase();
    var parameter = Form.Element.Serializers[method](element);

    if (parameter) {
      var key = encodeURIComponent(parameter[0]);
      if (key.length == 0) return;

      if (parameter[1].constructor != Array)
        parameter[1] = [parameter[1]];

      return parameter[1].map(function(value) {
        return key + '=' + encodeURIComponent(value);
      }).join('&');
    }
  },

  getValue: function(element) {
    element = $(element);
    var method = element.tagName.toLowerCase();
    var parameter = Form.Element.Serializers[method](element);

    if (parameter)
      return parameter[1];
  }
}

Form.Element.Serializers = {
  input: function(element) {
    switch (element.type.toLowerCase()) {
      case 'submit':
      case 'hidden':
      case 'password':
      case 'text':
        return Form.Element.Serializers.textarea(element);
      case 'checkbox':
      case 'radio':
        return Form.Element.Serializers.inputSelector(element);
    }
    return false;
  },

  inputSelector: function(element) {
    if (element.checked)
      return [element.name, element.value];
  },

  textarea: function(element) {
    return [element.name, element.value];
  },

  select: function(element) {
    return Form.Element.Serializers[element.type == 'select-one' ?
      'selectOne' : 'selectMany'](element);
  },

  selectOne: function(element) {
    var value = '', opt, index = element.selectedIndex;
    if (index >= 0) {
      opt = element.options[index];
      value = opt.value;
      if (!value && !('value' in opt))
        value = opt.text;
    }
    return [element.name, value];
  },

  selectMany: function(element) {
    var value = new Array();
    for (var i = 0; i < element.length; i++) {
      var opt = element.options[i];
      if (opt.selected) {
        var optValue = opt.value;
        if (!optValue && !('value' in opt))
          optValue = opt.text;
        value.push(optValue);
      }
    }
    return [element.name, value];
  }
}

/*--------------------------------------------------------------------------*/

var $F = Form.Element.getValue;

/*--------------------------------------------------------------------------*/

Abstract.TimedObserver = function() {}
Abstract.TimedObserver.prototype = {
  initialize: function(element, frequency, callback) {
    this.frequency = frequency;
    this.element   = $(element);
    this.callback  = callback;

    this.lastValue = this.getValue();
    this.registerCallback();
  },

  registerCallback: function() {
    setInterval(this.onTimerEvent.bind(this), this.frequency * 1000);
  },

  onTimerEvent: function() {
    var value = this.getValue();
    if (this.lastValue != value) {
      this.callback(this.element, value);
      this.lastValue = value;
    }
  }
}

Form.Element.Observer = Class.create();
Form.Element.Observer.prototype = Object.extend(new Abstract.TimedObserver(), {
  getValue: function() {
    return Form.Element.getValue(this.element);
  }
});

Form.Observer = Class.create();
Form.Observer.prototype = Object.extend(new Abstract.TimedObserver(), {
  getValue: function() {
    return Form.serialize(this.element);
  }
});

/*--------------------------------------------------------------------------*/

Abstract.EventObserver = function() {}
Abstract.EventObserver.prototype = {
  initialize: function(element, callback) {
    this.element  = $(element);
    this.callback = callback;

    this.lastValue = this.getValue();
    if (this.element.tagName.toLowerCase() == 'form')
      this.registerFormCallbacks();
    else
      this.registerCallback(this.element);
  },

  onElementEvent: function() {
    var value = this.getValue();
    if (this.lastValue != value) {
      this.callback(this.element, value);
      this.lastValue = value;
    }
  },

  registerFormCallbacks: function() {
    var elements = Form.getElements(this.element);
    for (var i = 0; i < elements.length; i++)
      this.registerCallback(elements[i]);
  },

  registerCallback: function(element) {
    if (element.type) {
      switch (element.type.toLowerCase()) {
        case 'checkbox':
        case 'radio':
          Event.observe(element, 'click', this.onElementEvent.bind(this));
          break;
        case 'password':
        case 'text':
        case 'textarea':
        case 'select-one':
        case 'select-multiple':
          Event.observe(element, 'change', this.onElementEvent.bind(this));
          break;
      }
    }
  }
}

Form.Element.EventObserver = Class.create();
Form.Element.EventObserver.prototype = Object.extend(new Abstract.EventObserver(), {
  getValue: function() {
    return Form.Element.getValue(this.element);
  }
});

Form.EventObserver = Class.create();
Form.EventObserver.prototype = Object.extend(new Abstract.EventObserver(), {
  getValue: function() {
    return Form.serialize(this.element);
  }
});
if (!window.Event) {
  var Event = new Object();
}

Object.extend(Event, {
  KEY_BACKSPACE: 8,
  KEY_TAB:       9,
  KEY_RETURN:   13,
  KEY_ESC:      27,
  KEY_LEFT:     37,
  KEY_UP:       38,
  KEY_RIGHT:    39,
  KEY_DOWN:     40,
  KEY_DELETE:   46,

  element: function(event) {
    return event.target || event.srcElement;
  },

  isLeftClick: function(event) {
    return (((event.which) && (event.which == 1)) ||
            ((event.button) && (event.button == 1)));
  },

  pointerX: function(event) {
    return event.pageX || (event.clientX +
      (document.documentElement.scrollLeft || document.body.scrollLeft));
  },

  pointerY: function(event) {
    return event.pageY || (event.clientY +
      (document.documentElement.scrollTop || document.body.scrollTop));
  },

  stop: function(event) {
    if (event.preventDefault) {
      event.preventDefault();
      event.stopPropagation();
    } else {
      event.returnValue = false;
      event.cancelBubble = true;
    }
  },

  // find the first node with the given tagName, starting from the
  // node the event was triggered on; traverses the DOM upwards
  findElement: function(event, tagName) {
    var element = Event.element(event);
    while (element.parentNode && (!element.tagName ||
        (element.tagName.toUpperCase() != tagName.toUpperCase())))
      element = element.parentNode;
    return element;
  },

  observers: false,

  _observeAndCache: function(element, name, observer, useCapture) {
    if (!this.observers) this.observers = [];
    if (element.addEventListener) {
      this.observers.push([element, name, observer, useCapture]);
      element.addEventListener(name, observer, useCapture);
    } else if (element.attachEvent) {
      this.observers.push([element, name, observer, useCapture]);
      element.attachEvent('on' + name, observer);
    }
  },

  unloadCache: function() {
    if (!Event.observers) return;
    for (var i = 0; i < Event.observers.length; i++) {
      Event.stopObserving.apply(this, Event.observers[i]);
      Event.observers[i][0] = null;
    }
    Event.observers = false;
  },

  observe: function(element, name, observer, useCapture) {
    var element = $(element);
    useCapture = useCapture || false;

    if (name == 'keypress' &&
        (navigator.appVersion.match(/Konqueror|Safari|KHTML/)
        || element.attachEvent))
      name = 'keydown';

    this._observeAndCache(element, name, observer, useCapture);
  },

  stopObserving: function(element, name, observer, useCapture) {
    var element = $(element);
    useCapture = useCapture || false;

    if (name == 'keypress' &&
        (navigator.appVersion.match(/Konqueror|Safari|KHTML/)
        || element.detachEvent))
      name = 'keydown';

    if (element.removeEventListener) {
      element.removeEventListener(name, observer, useCapture);
    } else if (element.detachEvent) {
      element.detachEvent('on' + name, observer);
    }
  }
});

/* prevent memory leaks in IE */
Event.observe(window, 'unload', Event.unloadCache, false);
var Position = {
  // set to true if needed, warning: firefox performance problems
  // NOT neeeded for page scrolling, only if draggable contained in
  // scrollable elements
  includeScrollOffsets: false,

  // must be called before calling withinIncludingScrolloffset, every time the
  // page is scrolled
  prepare: function() {
    this.deltaX =  window.pageXOffset
                || document.documentElement.scrollLeft
                || document.body.scrollLeft
                || 0;
    this.deltaY =  window.pageYOffset
                || document.documentElement.scrollTop
                || document.body.scrollTop
                || 0;
  },

  realOffset: function(element) {
    var valueT = 0, valueL = 0;
    do {
      valueT += element.scrollTop  || 0;
      valueL += element.scrollLeft || 0;
      element = element.parentNode;
    } while (element);
    return [valueL, valueT];
  },

  cumulativeOffset: function(element) {
    var valueT = 0, valueL = 0;
    do {
      valueT += element.offsetTop  || 0;
      valueL += element.offsetLeft || 0;
      element = element.offsetParent;
    } while (element);
    return [valueL, valueT];
  },

  positionedOffset: function(element) {
    var valueT = 0, valueL = 0;
    do {
      valueT += element.offsetTop  || 0;
      valueL += element.offsetLeft || 0;
      element = element.offsetParent;
      if (element) {
        p = Element.getStyle(element, 'position');
        if (p == 'relative' || p == 'absolute') break;
      }
    } while (element);
    return [valueL, valueT];
  },

  offsetParent: function(element) {
    if (element.offsetParent) return element.offsetParent;
    if (element == document.body) return element;

    while ((element = element.parentNode) && element != document.body)
      if (Element.getStyle(element, 'position') != 'static')
        return element;

    return document.body;
  },

  // caches x/y coordinate pair to use with overlap
  within: function(element, x, y) {
    if (this.includeScrollOffsets)
      return this.withinIncludingScrolloffsets(element, x, y);
    this.xcomp = x;
    this.ycomp = y;
    this.offset = this.cumulativeOffset(element);

    return (y >= this.offset[1] &&
            y <  this.offset[1] + element.offsetHeight &&
            x >= this.offset[0] &&
            x <  this.offset[0] + element.offsetWidth);
  },

  withinIncludingScrolloffsets: function(element, x, y) {
    var offsetcache = this.realOffset(element);

    this.xcomp = x + offsetcache[0] - this.deltaX;
    this.ycomp = y + offsetcache[1] - this.deltaY;
    this.offset = this.cumulativeOffset(element);

    return (this.ycomp >= this.offset[1] &&
            this.ycomp <  this.offset[1] + element.offsetHeight &&
            this.xcomp >= this.offset[0] &&
            this.xcomp <  this.offset[0] + element.offsetWidth);
  },

  // within must be called directly before
  overlap: function(mode, element) {
    if (!mode) return 0;
    if (mode == 'vertical')
      return ((this.offset[1] + element.offsetHeight) - this.ycomp) /
        element.offsetHeight;
    if (mode == 'horizontal')
      return ((this.offset[0] + element.offsetWidth) - this.xcomp) /
        element.offsetWidth;
  },

  clone: function(source, target) {
    source = $(source);
    target = $(target);
    target.style.position = 'absolute';
    var offsets = this.cumulativeOffset(source);
    target.style.top    = offsets[1] + 'px';
    target.style.left   = offsets[0] + 'px';
    target.style.width  = source.offsetWidth + 'px';
    target.style.height = source.offsetHeight + 'px';
  },

  page: function(forElement) {
    var valueT = 0, valueL = 0;

    var element = forElement;
    do {
      valueT += element.offsetTop  || 0;
      valueL += element.offsetLeft || 0;

      // Safari fix
      if (element.offsetParent==document.body)
        if (Element.getStyle(element,'position')=='absolute') break;

    } while (element = element.offsetParent);

    element = forElement;
    do {
      valueT -= element.scrollTop  || 0;
      valueL -= element.scrollLeft || 0;
    } while (element = element.parentNode);

    return [valueL, valueT];
  },

  clone: function(source, target) {
    var options = Object.extend({
      setLeft:    true,
      setTop:     true,
      setWidth:   true,
      setHeight:  true,
      offsetTop:  0,
      offsetLeft: 0
    }, arguments[2] || {})

    // find page position of source
    source = $(source);
    var p = Position.page(source);

    // find coordinate system to use
    target = $(target);
    var delta = [0, 0];
    var parent = null;
    // delta [0,0] will do fine with position: fixed elements,
    // position:absolute needs offsetParent deltas
    if (Element.getStyle(target,'position') == 'absolute') {
      parent = Position.offsetParent(target);
      delta = Position.page(parent);
    }

    // correct by body offsets (fixes Safari)
    if (parent == document.body) {
      delta[0] -= document.body.offsetLeft;
      delta[1] -= document.body.offsetTop;
    }

    // set position
    if(options.setLeft)   target.style.left  = (p[0] - delta[0] + options.offsetLeft) + 'px';
    if(options.setTop)    target.style.top   = (p[1] - delta[1] + options.offsetTop) + 'px';
    if(options.setWidth)  target.style.width = source.offsetWidth + 'px';
    if(options.setHeight) target.style.height = source.offsetHeight + 'px';
  },

  absolutize: function(element) {
    element = $(element);
    if (element.style.position == 'absolute') return;
    Position.prepare();

    var offsets = Position.positionedOffset(element);
    var top     = offsets[1];
    var left    = offsets[0];
    var width   = element.clientWidth;
    var height  = element.clientHeight;

    element._originalLeft   = left - parseFloat(element.style.left  || 0);
    element._originalTop    = top  - parseFloat(element.style.top || 0);
    element._originalWidth  = element.style.width;
    element._originalHeight = element.style.height;

    element.style.position = 'absolute';
    element.style.top    = top + 'px';;
    element.style.left   = left + 'px';;
    element.style.width  = width + 'px';;
    element.style.height = height + 'px';;
  },

  relativize: function(element) {
    element = $(element);
    if (element.style.position == 'relative') return;
    Position.prepare();

    element.style.position = 'relative';
    var top  = parseFloat(element.style.top  || 0) - (element._originalTop || 0);
    var left = parseFloat(element.style.left || 0) - (element._originalLeft || 0);

    element.style.top    = top + 'px';
    element.style.left   = left + 'px';
    element.style.height = element._originalHeight;
    element.style.width  = element._originalWidth;
  }
}

// Safari returns margins on body which is incorrect if the child is absolutely
// positioned.  For performance reasons, redefine Position.cumulativeOffset for
// KHTML/WebKit only.
if (/Konqueror|Safari|KHTML/.test(navigator.userAgent)) {
  Position.cumulativeOffset = function(element) {
    var valueT = 0, valueL = 0;
    do {
      valueT += element.offsetTop  || 0;
      valueL += element.offsetLeft || 0;
      if (element.offsetParent == document.body)
        if (Element.getStyle(element, 'position') == 'absolute') break;

      element = element.offsetParent;
    } while (element);

    return [valueL, valueT];
  }
}
var loginWindowActive = false;
var action = new Function("void(0);");

var ALIGN_RIGHT = 1;
var ALIGN_LEFT = 2;
var loginWidget;

function showLoginWindow(position, align, a ){
	if (loginWindowActive) {
		hideLoginWindow();
		return;
	}
	action = a;
	loginWindowActive = true;
	var verticalPosition = findPosY(position)+position.offsetHeight-1;
	var horizontalPosition = align==ALIGN_RIGHT?'':(align==ALIGN_LEFT?findPosX(position):'');		
	
	Element.show('loginWindow');
	// this is for when we open the form after a reactivation or something else
	Element.show('loginAreaFields'); 
	
	if (align == ALIGN_RIGHT) {
		horizontalPosition = Number(findPosX(position)-Element.getDimensions('innerLoginWindow').width+
			Element.getDimensions(position).width+8);
	}	
	document.getElementById("innerLoginWindow").style.top=verticalPosition+'px';
	document.getElementById("innerLoginWindow").style.left=horizontalPosition+'px';
	
	Element.hide('loginUpperArea');
	Element.show('innerLoginWindow');
}

function showReactivationWindow(email) {
	Element.hide('loginAreaFields');
	Element.update('loginUpperArea',getReactivationArea(email));
	Element.show('loginUpperArea');
}

function showResetPasswordWindow() {
	Element.hide('loginAreaFields');
	Element.update('loginUpperArea',getResetPasswordArea());
	Element.show('loginUpperArea');
}

function getRegister() {
	return '<h2>'+JSResource.login_getRegister_newUsers+'</h2>'+
	'<p><input value="'+JSResource.login_getRegister_register+'" id="submitButton" type="button" onClick="javascript:document.location.href=\''+registerURL+'\'"/></p>';
}

function getReactivationArea(email) {
	return '<p><label for="newemail">'+JSResource.login_getReactivationArea_resendActivation+'</label> <input type="text" id="newemail" name="newemail" style="width: 100%" value="'+email+'"/></p>'+
	'<p><input value="'+JSResource.login_getReactivationArea_resend+'" type="button" onClick="doReactivate(true)"/></p></div>';
}

function getResetPasswordArea() {
	return '<p><label for="email">'+JSResource.login_email+'</label> <input type="text" id="email" name="email" style="width: 100%" /></p>'+
	'<p><input value="'+JSResource.login_getResetPasswordArea_send+'" type="button" onClick="doResetPassword()"/></p></div>';
}


function hideLoginWindow() {
	Element.hide('innerLoginWindow');	
	Element.hide('loginWindow');
	if(document.getElementById("username")){
		document.getElementById("username").value="";
	}
	if(document.getElementById("password")){
		document.getElementById("password").value="";
	}
	Element.hide('loginMessage');
	loginWindowActive = false;
}

function doReactivate(newEmail) {
	var handlerFunc = function(t) {
		var response = trim(t.responseText);
		if (response.substring(0,6)=='error:') {
			Element.update('loginMessage',response.substring(6,response.length));
		}
		else {
		 	Element.update('loginMessage',response);
		 	setTimeout('hideLoginWindow()',3000);		 	
		}
	}
	
	var errFunc = function(t) {
	    alert(JSResource.error + ' ' + t.status + ' -- ' + t.statusText);
	}
	
	Element.update('loginMessage',JSResource.login_sendingRequest);		
	Element.show('loginMessage');	
	if (newEmail) {
		var tempValue = $(('newemail')).value;
		$(('newemail')).value = '';
		$(('newemail')).value = tempValue;	
		new Ajax.Request(reactivateURL, 
			{method:'post', 
			parameters:'newAddress=true&email='+fullEscape($(('newemail')).value) + '&language=' + loginLanguage, 
			onSuccess:handlerFunc, onFailure:errFunc});
	}
	else {
		new Ajax.Request(reactivateURL, 
			{method:'post', 
			parameters:'', 
			onSuccess:handlerFunc, onFailure:errFunc});
	}
}

function doResetPassword() {
	var handlerFunc = function(t) {
		var response = trim(t.responseText);
		if (response.substring(0,6)=='error:') {
			Element.update('loginMessage',response.substring(6,response.length));
		}
		else if (response.substring(0,2)=='ok') {
		 	Element.update('loginMessage','<p>Email '+JSResource.login_doResetPassword_sent+'</p>');
		 	setTimeout('hideLoginWindow()',3000);
		}
	}
	
	var errFunc = function(t) {
	    alert(JSResource.error + ' ' + t.status + ' -- ' + t.statusText);
	}
	
	Element.update('loginMessage',JSResource.login_sendingRequest);		
	Element.show('loginMessage');
	var tempValue = $(('email')).value;
	$(('email')).value = '';
	$(('email')).value = tempValue;	
	new Ajax.Request(reserpasswordURL, 
		{method:'post', 
		parameters:'email='+fullEscape($(('email')).value), 
		onSuccess:handlerFunc, onFailure:errFunc});
}

function doLogin() {
	var handlerFunc = function(t) {
		var response = trim(t.responseText);
		if (response.substring(0,6)=='error:') {
			Element.update('loginMessage',response.substring(6,response.length));
		}
		else if (response.substring(0,2)=='ok') {
		 	Element.update('loginMessage','<p>'+JSResource.login_doLogin_loginOK+'<p>');	
			loggedIn = true;
			loginWidget = response.substring(3,response.length);
			decoratePage();
		 	hideLoginWindow();
		 	action();
		}
	}
	
	var errFunc = function(t) {
	    alert(JSResource.error + ' ' + t.status + ' -- ' + t.statusText);
	}
	
	Element.update('loginMessage',JSResource.login_sendingRequest);		
	Element.show('loginMessage');

	var tempValue = $(('username')).value;
	$(('username')).value = '';
	$(('username')).value = tempValue;
	var tempValue = $(('password')).value;
	$(('password')).value = '';
	$(('password')).value = tempValue;
	new Ajax.Request(loginURL, 
		{method:'post', 
		parameters:'username='+fullEscape($(('username')).value)+'&password='+fullEscape($(('password')).value) + '&language=' + loginLanguage, 
		onSuccess:handlerFunc, onFailure:errFunc});
}


function decoratePage() {
	if (document.getElementById('mainLoginArea')!=null) {
		Element.update('mainLoginArea',loginWidget);
	}
	if (document.getElementById('mainCommunitiesArea')!=null) {
		DWRActionUtil.execute({namespace: '/widgets', action: 'communityWidget', executeResult: 'true'}, {}, updateCommunityWidget);
	}
	
}

function updateCommunityWidget(text){
	if(text != "") {
		var communityWidget = document.getElementById('communities');
		if(communityWidget){
			communityWidget.innerHTML = text;
		}
	}
}

