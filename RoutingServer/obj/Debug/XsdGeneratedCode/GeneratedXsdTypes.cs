﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Ce code a été généré par un outil.
//     Version du runtime :4.0.30319.42000
//
//     Les modifications apportées à ce fichier peuvent provoquer un comportement incorrect et seront perdues si
//     le code est régénéré.
// </auto-generated>
//------------------------------------------------------------------------------

namespace RoutingServer.ContractTypes
{
    using System.Xml.Serialization;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("MSBuild", "17.3.1+2badb37d109910fbd3155cf8743224b7a27494d8")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(TypeName="Station.Position", Namespace="http://schemas.datacontract.org/2004/07/ProxyServer.JCDECAUXRestClient")]
    [System.Xml.Serialization.XmlRootAttribute("Station.Position", Namespace="http://schemas.datacontract.org/2004/07/ProxyServer.JCDECAUXRestClient", IsNullable=true)]
    public partial class StationPosition
    {
        
        private double latField;
        
        private bool latFieldSpecified;
        
        private double lngField;
        
        private bool lngFieldSpecified;
        
        /// <remarks/>
        public double lat
        {
            get
            {
                return this.latField;
            }
            set
            {
                this.latField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool latSpecified
        {
            get
            {
                return this.latFieldSpecified;
            }
            set
            {
                this.latFieldSpecified = value;
            }
        }
        
        /// <remarks/>
        public double lng
        {
            get
            {
                return this.lngField;
            }
            set
            {
                this.lngField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool lngSpecified
        {
            get
            {
                return this.lngFieldSpecified;
            }
            set
            {
                this.lngFieldSpecified = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("MSBuild", "17.3.1+2badb37d109910fbd3155cf8743224b7a27494d8")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.datacontract.org/2004/07/ProxyServer.JCDECAUXRestClient")]
    [System.Xml.Serialization.XmlRootAttribute(Namespace="http://schemas.datacontract.org/2004/07/ProxyServer.JCDECAUXRestClient", IsNullable=true)]
    public partial class Station
    {
        
        private string addressField;
        
        private int available_bike_standsField;
        
        private bool available_bike_standsFieldSpecified;
        
        private int available_bikesField;
        
        private bool available_bikesFieldSpecified;
        
        private bool bankingField;
        
        private bool bankingFieldSpecified;
        
        private int bike_standsField;
        
        private bool bike_standsFieldSpecified;
        
        private bool bonusField;
        
        private bool bonusFieldSpecified;
        
        private string contract_nameField;
        
        private string nameField;
        
        private int numberField;
        
        private bool numberFieldSpecified;
        
        private StationPosition positionField;
        
        private string statusField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string address
        {
            get
            {
                return this.addressField;
            }
            set
            {
                this.addressField = value;
            }
        }
        
        /// <remarks/>
        public int available_bike_stands
        {
            get
            {
                return this.available_bike_standsField;
            }
            set
            {
                this.available_bike_standsField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool available_bike_standsSpecified
        {
            get
            {
                return this.available_bike_standsFieldSpecified;
            }
            set
            {
                this.available_bike_standsFieldSpecified = value;
            }
        }
        
        /// <remarks/>
        public int available_bikes
        {
            get
            {
                return this.available_bikesField;
            }
            set
            {
                this.available_bikesField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool available_bikesSpecified
        {
            get
            {
                return this.available_bikesFieldSpecified;
            }
            set
            {
                this.available_bikesFieldSpecified = value;
            }
        }
        
        /// <remarks/>
        public bool banking
        {
            get
            {
                return this.bankingField;
            }
            set
            {
                this.bankingField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool bankingSpecified
        {
            get
            {
                return this.bankingFieldSpecified;
            }
            set
            {
                this.bankingFieldSpecified = value;
            }
        }
        
        /// <remarks/>
        public int bike_stands
        {
            get
            {
                return this.bike_standsField;
            }
            set
            {
                this.bike_standsField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool bike_standsSpecified
        {
            get
            {
                return this.bike_standsFieldSpecified;
            }
            set
            {
                this.bike_standsFieldSpecified = value;
            }
        }
        
        /// <remarks/>
        public bool bonus
        {
            get
            {
                return this.bonusField;
            }
            set
            {
                this.bonusField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool bonusSpecified
        {
            get
            {
                return this.bonusFieldSpecified;
            }
            set
            {
                this.bonusFieldSpecified = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string contract_name
        {
            get
            {
                return this.contract_nameField;
            }
            set
            {
                this.contract_nameField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }
        
        /// <remarks/>
        public int number
        {
            get
            {
                return this.numberField;
            }
            set
            {
                this.numberField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool numberSpecified
        {
            get
            {
                return this.numberFieldSpecified;
            }
            set
            {
                this.numberFieldSpecified = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public StationPosition position
        {
            get
            {
                return this.positionField;
            }
            set
            {
                this.positionField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string status
        {
            get
            {
                return this.statusField;
            }
            set
            {
                this.statusField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("MSBuild", "17.3.1+2badb37d109910fbd3155cf8743224b7a27494d8")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://schemas.datacontract.org/2004/07/ProxyServer.JCDECAUXRestClient")]
    [System.Xml.Serialization.XmlRootAttribute(Namespace="http://schemas.datacontract.org/2004/07/ProxyServer.JCDECAUXRestClient", IsNullable=true)]
    public partial class ArrayOfStation
    {
        
        private Station[] stationField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("Station", IsNullable=true)]
        public Station[] Station
        {
            get
            {
                return this.stationField;
            }
            set
            {
                this.stationField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("MSBuild", "17.3.1+2badb37d109910fbd3155cf8743224b7a27494d8")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://tempuri.org/")]
    [System.Xml.Serialization.XmlRootAttribute(Namespace="http://tempuri.org/", IsNullable=false)]
    public partial class GetStationsByContract
    {
        
        private string contractField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string contract
        {
            get
            {
                return this.contractField;
            }
            set
            {
                this.contractField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("MSBuild", "17.3.1+2badb37d109910fbd3155cf8743224b7a27494d8")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://tempuri.org/")]
    [System.Xml.Serialization.XmlRootAttribute(Namespace="http://tempuri.org/", IsNullable=false)]
    public partial class GetStationsByContractResponse
    {
        
        private Station[] getStationsByContractResultField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlArrayAttribute(IsNullable=true)]
        [System.Xml.Serialization.XmlArrayItemAttribute(Namespace="http://schemas.datacontract.org/2004/07/ProxyServer.JCDECAUXRestClient")]
        public Station[] GetStationsByContractResult
        {
            get
            {
                return this.getStationsByContractResultField;
            }
            set
            {
                this.getStationsByContractResultField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("MSBuild", "17.3.1+2badb37d109910fbd3155cf8743224b7a27494d8")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://tempuri.org/")]
    [System.Xml.Serialization.XmlRootAttribute(Namespace="http://tempuri.org/", IsNullable=false)]
    public partial class GetAllStations
    {
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("MSBuild", "17.3.1+2badb37d109910fbd3155cf8743224b7a27494d8")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://tempuri.org/")]
    [System.Xml.Serialization.XmlRootAttribute(Namespace="http://tempuri.org/", IsNullable=false)]
    public partial class GetAllStationsResponse
    {
        
        private Station[] getAllStationsResultField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlArrayAttribute(IsNullable=true)]
        [System.Xml.Serialization.XmlArrayItemAttribute(Namespace="http://schemas.datacontract.org/2004/07/ProxyServer.JCDECAUXRestClient")]
        public Station[] GetAllStationsResult
        {
            get
            {
                return this.getAllStationsResultField;
            }
            set
            {
                this.getAllStationsResultField = value;
            }
        }
    }
}
