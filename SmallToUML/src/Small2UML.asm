<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Small2UML"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchPackage():V"/>
		<constant value="A.__matchClass():V"/>
		<constant value="A.__matchType():V"/>
		<constant value="A.__matchEnumeration():V"/>
		<constant value="__exec__"/>
		<constant value="Package"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyPackage(NTransientLink;):V"/>
		<constant value="Class"/>
		<constant value="A.__applyClass(NTransientLink;):V"/>
		<constant value="Type"/>
		<constant value="A.__applyType(NTransientLink;):V"/>
		<constant value="Enumeration"/>
		<constant value="A.__applyEnumeration(NTransientLink;):V"/>
		<constant value="__matchPackage"/>
		<constant value="MM"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="f"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="MM1"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-14:4"/>
		<constant value="__applyPackage"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="elements"/>
		<constant value="association"/>
		<constant value="J.and(J):J"/>
		<constant value="packagedElement"/>
		<constant value="12:12-12:13"/>
		<constant value="12:12-12:18"/>
		<constant value="12:4-12:18"/>
		<constant value="13:23-13:24"/>
		<constant value="13:23-13:33"/>
		<constant value="13:38-13:39"/>
		<constant value="13:38-13:51"/>
		<constant value="13:23-13:51"/>
		<constant value="13:4-13:51"/>
		<constant value="link"/>
		<constant value="__matchClass"/>
		<constant value="21:3-27:4"/>
		<constant value="__applyClass"/>
		<constant value="isAbstract"/>
		<constant value="super"/>
		<constant value="superClass"/>
		<constant value="attribute"/>
		<constant value="ownedAttribute"/>
		<constant value="operation"/>
		<constant value="ownedOperation"/>
		<constant value="22:12-22:13"/>
		<constant value="22:12-22:18"/>
		<constant value="22:4-22:18"/>
		<constant value="23:18-23:19"/>
		<constant value="23:18-23:30"/>
		<constant value="23:4-23:30"/>
		<constant value="24:18-24:19"/>
		<constant value="24:18-24:25"/>
		<constant value="24:4-24:25"/>
		<constant value="25:22-25:23"/>
		<constant value="25:22-25:33"/>
		<constant value="25:4-25:33"/>
		<constant value="26:22-26:23"/>
		<constant value="26:22-26:33"/>
		<constant value="26:4-26:33"/>
		<constant value="__matchType"/>
		<constant value="34:3-36:4"/>
		<constant value="__applyType"/>
		<constant value="35:12-35:13"/>
		<constant value="35:12-35:18"/>
		<constant value="35:4-35:18"/>
		<constant value="__matchEnumeration"/>
		<constant value="43:3-46:4"/>
		<constant value="__applyEnumeration"/>
		<constant value="44:12-44:13"/>
		<constant value="44:12-44:18"/>
		<constant value="44:4-44:18"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="45"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="45"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="66" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="67">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="72"/>
			<load arg="29"/>
			<get arg="73"/>
			<call arg="74"/>
			<call arg="30"/>
			<set arg="75"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="76" begin="11" end="11"/>
			<lne id="77" begin="11" end="12"/>
			<lne id="78" begin="9" end="14"/>
			<lne id="79" begin="17" end="17"/>
			<lne id="80" begin="17" end="18"/>
			<lne id="81" begin="19" end="19"/>
			<lne id="82" begin="19" end="20"/>
			<lne id="83" begin="17" end="21"/>
			<lne id="84" begin="15" end="23"/>
			<lne id="66" begin="8" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="62" begin="7" end="24"/>
			<lve slot="2" name="60" begin="3" end="24"/>
			<lve slot="0" name="17" begin="0" end="24"/>
			<lve slot="1" name="85" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="86">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="48"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="48"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="87" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="88">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="89"/>
			<call arg="30"/>
			<set arg="89"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="90"/>
			<call arg="30"/>
			<set arg="91"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="92"/>
			<call arg="30"/>
			<set arg="93"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="94"/>
			<call arg="30"/>
			<set arg="95"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="96" begin="11" end="11"/>
			<lne id="97" begin="11" end="12"/>
			<lne id="98" begin="9" end="14"/>
			<lne id="99" begin="17" end="17"/>
			<lne id="100" begin="17" end="18"/>
			<lne id="101" begin="15" end="20"/>
			<lne id="102" begin="23" end="23"/>
			<lne id="103" begin="23" end="24"/>
			<lne id="104" begin="21" end="26"/>
			<lne id="105" begin="29" end="29"/>
			<lne id="106" begin="29" end="30"/>
			<lne id="107" begin="27" end="32"/>
			<lne id="108" begin="35" end="35"/>
			<lne id="109" begin="35" end="36"/>
			<lne id="110" begin="33" end="38"/>
			<lne id="87" begin="8" end="39"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="62" begin="7" end="39"/>
			<lve slot="2" name="60" begin="3" end="39"/>
			<lve slot="0" name="17" begin="0" end="39"/>
			<lve slot="1" name="85" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="111">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="50"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="50"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="112" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="113">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="114" begin="11" end="11"/>
			<lne id="115" begin="11" end="12"/>
			<lne id="116" begin="9" end="14"/>
			<lne id="112" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="62" begin="7" end="15"/>
			<lve slot="2" name="60" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="85" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="117">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="52"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="118" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="119">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="120" begin="11" end="11"/>
			<lne id="121" begin="11" end="12"/>
			<lne id="122" begin="9" end="14"/>
			<lne id="118" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="62" begin="7" end="15"/>
			<lve slot="2" name="60" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="85" begin="0" end="15"/>
		</localvariabletable>
	</operation>
</asm>
