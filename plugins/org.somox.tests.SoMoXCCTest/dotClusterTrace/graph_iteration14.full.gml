graph [
directed 1
node [
name "org.somox.core.subcore2.MySingleClass
"
label "org.somox.core.subcore2.MySingleClass
"
graphics
[hasFill 0
]
]
node [
name "org.somox.core.WithCore
org.somox.core.Core
org.somox.core.Helper
org.somox.core.ICoreParent
org.somox.core.IProvided
org.somox.core.ICore
"
label "org.somox.core.WithCore
org.somox.core.Core
org.somox.core.Helper
org.somox.core.ICoreParent
org.somox.core.IProvided
org.somox.core.ICore
"
graphics
[hasFill 0
]
]
node [
name "org.somox.core.subcore.MyClass1
org.somox.core.subcore.MyClass2
org.somox.core.subcore.sub2.SubSubClass
"
label "org.somox.core.subcore.MyClass1
org.somox.core.subcore.MyClass2
org.somox.core.subcore.sub2.SubSubClass
"
graphics
[hasFill 0
]
]
edge [
source "org.somox.core.WithCore
org.somox.core.Core
org.somox.core.Helper
org.somox.core.ICoreParent
org.somox.core.IProvided
org.somox.core.ICore
"
target "org.somox.core.subcore2.MySingleClass
"
label "AfferentCoupling = 4,00
DefaultMergeIndicatingMetric = ,30
SubsystemComponent = ,33
Abstractness = ,43
PackageMapping = ,75
ExternalAccessesCount = 2,00
AbstractTypesCount = 3,00
Instability = ,33
DMS = ,24
AdherenceToInterfaceCommunication = ,00
Coupling = ,00
SliceLayerArchitectureQuality = ,33
TotalTypesCount = 7,00
EfferentCoupling = 2,00
InternalAccessesCount = ,00
NameResemblance = ,21
DirectoryMapping = ,88
DefaultCompositionIndicatingMetric = ,28
InterfaceAccessesCount = ,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "org.somox.core.subcore2.MySingleClass
"
target "org.somox.core.WithCore
org.somox.core.Core
org.somox.core.Helper
org.somox.core.ICoreParent
org.somox.core.IProvided
org.somox.core.ICore
"
label "AfferentCoupling = 4,00
DefaultMergeIndicatingMetric = ,30
SubsystemComponent = ,33
Abstractness = ,43
PackageMapping = ,75
ExternalAccessesCount = ,00
AbstractTypesCount = 3,00
Instability = ,33
AdherenceToInterfaceCommunication = ,00
DMS = ,24
Coupling = ,00
SliceLayerArchitectureQuality = ,33
TotalTypesCount = 7,00
EfferentCoupling = 2,00
InternalAccessesCount = ,00
NameResemblance = ,21
DirectoryMapping = ,88
DefaultCompositionIndicatingMetric = ,28
InterfaceAccessesCount = ,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "org.somox.core.subcore.MyClass1
org.somox.core.subcore.MyClass2
org.somox.core.subcore.sub2.SubSubClass
"
target "org.somox.core.WithCore
org.somox.core.Core
org.somox.core.Helper
org.somox.core.ICoreParent
org.somox.core.IProvided
org.somox.core.ICore
"
label "AfferentCoupling = ,00
DefaultMergeIndicatingMetric = ,41
SubsystemComponent = ,00
Abstractness = ,33
PackageMapping = ,60
ExternalAccessesCount = 4,00
AbstractTypesCount = 3,00
Instability = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,00
Coupling = 1,00
SliceLayerArchitectureQuality = ,33
TotalTypesCount = 9,00
EfferentCoupling = ,00
InternalAccessesCount = 4,00
NameResemblance = ,29
DirectoryMapping = ,78
DefaultCompositionIndicatingMetric = ,36
InterfaceAccessesCount = ,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "org.somox.core.WithCore
org.somox.core.Core
org.somox.core.Helper
org.somox.core.ICoreParent
org.somox.core.IProvided
org.somox.core.ICore
"
target "org.somox.core.subcore.MyClass1
org.somox.core.subcore.MyClass2
org.somox.core.subcore.sub2.SubSubClass
"
label "AfferentCoupling = ,00
DefaultMergeIndicatingMetric = ,41
SubsystemComponent = ,00
Abstractness = ,33
PackageMapping = ,60
ExternalAccessesCount = 2,00
AbstractTypesCount = 3,00
Instability = ,00
AdherenceToInterfaceCommunication = ,00
DMS = ,67
Coupling = 1,00
SliceLayerArchitectureQuality = ,33
TotalTypesCount = 9,00
EfferentCoupling = ,00
InternalAccessesCount = 2,00
NameResemblance = ,29
DirectoryMapping = ,78
DefaultCompositionIndicatingMetric = ,36
InterfaceAccessesCount = ,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "org.somox.core.subcore.MyClass1
org.somox.core.subcore.MyClass2
org.somox.core.subcore.sub2.SubSubClass
"
target "org.somox.core.subcore2.MySingleClass
"
label "AfferentCoupling = 2,00
DefaultMergeIndicatingMetric = ,22
SubsystemComponent = ,00
Abstractness = ,00
PackageMapping = ,60
ExternalAccessesCount = 4,00
AbstractTypesCount = ,00
Instability = ,67
DMS = ,33
AdherenceToInterfaceCommunication = ,00
Coupling = ,00
SliceLayerArchitectureQuality = 1,00
TotalTypesCount = 4,00
EfferentCoupling = 4,00
InternalAccessesCount = ,00
NameResemblance = ,34
DirectoryMapping = ,78
DefaultCompositionIndicatingMetric = ,20
InterfaceAccessesCount = ,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "org.somox.core.subcore2.MySingleClass
"
target "org.somox.core.subcore.MyClass1
org.somox.core.subcore.MyClass2
org.somox.core.subcore.sub2.SubSubClass
"
label "AfferentCoupling = 2,00
DefaultMergeIndicatingMetric = ,22
SubsystemComponent = ,00
Abstractness = ,00
PackageMapping = ,60
ExternalAccessesCount = ,00
AbstractTypesCount = ,00
Instability = ,67
AdherenceToInterfaceCommunication = ,00
DMS = ,33
Coupling = ,00
SliceLayerArchitectureQuality = 1,00
TotalTypesCount = 4,00
EfferentCoupling = 4,00
InternalAccessesCount = ,00
NameResemblance = ,34
DirectoryMapping = ,78
DefaultCompositionIndicatingMetric = ,20
InterfaceAccessesCount = ,00
"
graphics
[
targetArrow "standard"
]
]
]
