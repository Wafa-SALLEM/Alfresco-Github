define(["dojo/_base/declare","alfresco/forms/controls/DragAndDropTargetControl","dojo/_base/lang","dojo/_base/array","dojo/on","dojo/keys","dojo/dom-class","dijit/registry"],function(f,a,b,i,j,m,k,l){return f([a],{syncNodesTopic:"",syncNodesWhiteListProp:"",syncNodesWhiteList:null,selectListenTopic:"",focusListenTopic:"",postCreate:function d(){this.inherited(arguments);j(document,"keydown",b.hitch(this,this.listenKeyDown));if(this.syncNodesTopic!=""){this.alfSubscribe(this.syncNodesTopic,b.hitch(this,this.syncNodes),true)}if(this.selectListenTopic!=""){this.alfSubscribe(this.selectListenTopic,b.hitch(this,this.listenSelection),true)}if(this.focusListenTopic!=""){this.alfSubscribe(this.focusListenTopic,b.hitch(this,this.listenFocus),true)}},syncNodes:function g(w){var r=b.getObject("wrappedWidget.previewTarget",false,this),v=/\[([^\]]+)\]/;if(r!=null){r.sync();var q=this._getCurrentCanvasWidgets(r);for(var u=0;u<q.length;++u){var s=l.byId(q[u].id),y=false,p=s.label.match(v),x=p?p[1]:s.label;for(var t=0;t<w.length;++t){var o=l.byId(w[t].firstChild.id);paletteObjMatch=o.title.match(v),paletteObjName=paletteObjMatch?paletteObjMatch[1]:o.title;if(x===paletteObjName){y=true;break}}if(!y){s.onItemDelete()}}r.sync();q=this._getCurrentCanvasWidgets(r);this.alfPublish(this.syncNodesTopic+"_CALLBACK",q,true)}},listenSelection:function c(q){this._previousItem=this._selectedItem;this._selectedItem=null;if(this._previousItem){var p=l.byId(this._previousItem);if(p){k.remove(p.domNode,"selected")}}if(q.item){this._selectedItem=q.item;var o=l.byId(this._selectedItem);if(o){k.add(o.domNode,"selected")}}},listenFocus:function n(o){this._focusedItem=null;if(o.item){this._focusedItem=o.item}},listenKeyDown:function e(o){if(this._selectedItem){var p=l.byId(this._selectedItem);if(p){switch(o.keyCode){case m.UP_ARROW:case m.LEFT_ARROW:p.onItemUp(o);o.preventDefault();break;case m.DOWN_ARROW:case m.RIGHT_ARROW:p.onItemDown(o);o.preventDefault();break;case m.DELETE:p.onItemDelete(o);o.preventDefault();break}}}if(this._focusedItem){var q=l.byId(this._focusedItem);if(q){switch(o.keyCode){case m.ENTER:case m.NUMPAD_ENTER:case m.SPACE:q.domNode.click();o.preventDefault();break}}}},_getCurrentCanvasWidgets:function h(q){var p=q.map,y=[];for(var r in p){if(p.hasOwnProperty(r)){var v=p[r],t=b.getObject(this.syncNodesWhiteListProp,false,v),o=l.byId(r);if(o!=null){if(this.syncNodesWhiteList.indexOf(t)==-1){y.push(o)}if(o.widgets&&o.widgets instanceof Array){for(var u=0;u<o.widgets.length;++u){var x=o.widgets[u];if(b.getObject("config.id",false,x)){var w=l.byId(x.config.id);if(w.previewTarget){var z=w.previewTarget.getAllNodes();for(var s=0;s<z.length;++s){var v=z[s],t=b.getObject(this.syncNodesWhiteListProp,false,v);if(this.syncNodesWhiteList.indexOf(v)==-1){y.push(v)}}w.previewTarget.selectNone()}}}}}}}return y}})});