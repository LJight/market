hello world!----name=${name!"默认空值"}
<br />
hello operator:${operator.operator!"null"}
<br />
操作内容：${operator.content!"null"}
<br />
当前时间：${data?string('yyyy-MM-dd HH:mm:ss')}
<br />
html转译函数(一般用在防止xss跨脚本攻击）：${html?html}
<br />
<#assign num = 100/>
<#assign aaaa = "sun"/>
页面自定义变量输出：${num},${aaaa}
<br />
map遍历:
<br />
<#list map?keys as k>
    ${k}----${map[k]}<br />
</#list>
if else操作
<br />
当前值：age=${age}
<br />
<#if age lte 10 >
 7   儿童
    <#elseif age gte 10 && age lte 18>
    青少年
    <#elseif age gte 18>
    成年人
</#if>
