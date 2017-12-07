<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:pt="http://xmlns.jcp.org/jsf/passthrough"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
<f:view>
    <h:body>
        <h:form>
            <div align="center">
                <h:dataTable value="#{CourseBean.courses}" var="course" bgcolor="pink" border="3">
                    <f:facet name="header">
                        <h:outputText value="可选课程列表"/>
                    </f:facet>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="课程流水号"/>
                        </f:facet>
                        #{course.couNo}
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="课程名称"/>
                        </f:facet>
                        #{course.couName}
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="任课教师号"/>
                        </f:facet>
                        #{course.teachNo}
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="任课教师"/>
                        </f:facet>
                        #{course.teachName}
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="剩余可选数量"/>
                        </f:facet>
                        #{course.availNum}
                    </h:column>
                </h:dataTable>
                <h:panelGrid columns="3">
                    <h:outputLabel for="LoginNo" value="复制流水课程号于此"/>
                    <h:inputText id="LoginNo" pt:placeholder="Enter CourseNo" pt:autofocus="true" required="true" requiredMessage="No ID" value="#{ManageCourseBean.courseNo}" />
                    <h:message for="LoginNo"/>
                </h:panelGrid>

                <h:panelGrid columns="1">
                    <!--<h:inputHidden value="#{InsertBean.student=LoginBean.student}"></h:inputHidden>-->
                    <!--inputhidden will cause devastating problem,interval 500-->
                    <h:outputLabel value="#{ManageCourseBean.student=LoginBean.student}"></h:outputLabel>
                    <h:outputLabel value="#{ManageCourseBean.student.stuNo}"></h:outputLabel>
                    <h:commandButton  value="删除课程" action="#{ManageCourseBean.delete()}"></h:commandButton>
                    <h:commandButton  value="报名考试" action="#"></h:commandButton>
                </h:panelGrid>
            </div>
        </h:form>
    </h:body>
</f:view>
</html>
