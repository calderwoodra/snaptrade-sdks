/*
 * SnapTrade
 *
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using SnapTrade.Net.Client;
using SnapTrade.Net.Model;

namespace SnapTrade.Net.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAPIDisclaimerApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Accept or Reject SnapTrade disclaimer agreement
        /// </summary>
        /// <exception cref="SnapTrade.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="userSecret"></param>
        /// <param name="snapTradeApiDisclaimerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>SnapTradeAPIDisclaimerAcceptStatus</returns>
        SnapTradeAPIDisclaimerAcceptStatus Accept(string userId, string userSecret, SnapTradeApiDisclaimerRequest snapTradeApiDisclaimerRequest, int operationIndex = 0);

        /// <summary>
        /// Accept or Reject SnapTrade disclaimer agreement
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="SnapTrade.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="userSecret"></param>
        /// <param name="snapTradeApiDisclaimerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of SnapTradeAPIDisclaimerAcceptStatus</returns>
        ApiResponse<SnapTradeAPIDisclaimerAcceptStatus> AcceptWithHttpInfo(string userId, string userSecret, SnapTradeApiDisclaimerRequest snapTradeApiDisclaimerRequest, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAPIDisclaimerApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Accept or Reject SnapTrade disclaimer agreement
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="SnapTrade.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="userSecret"></param>
        /// <param name="snapTradeApiDisclaimerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SnapTradeAPIDisclaimerAcceptStatus</returns>
        System.Threading.Tasks.Task<SnapTradeAPIDisclaimerAcceptStatus> AcceptAsync(string userId, string userSecret, SnapTradeApiDisclaimerRequest snapTradeApiDisclaimerRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Accept or Reject SnapTrade disclaimer agreement
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="SnapTrade.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="userSecret"></param>
        /// <param name="snapTradeApiDisclaimerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SnapTradeAPIDisclaimerAcceptStatus)</returns>
        System.Threading.Tasks.Task<ApiResponse<SnapTradeAPIDisclaimerAcceptStatus>> AcceptWithHttpInfoAsync(string userId, string userSecret, SnapTradeApiDisclaimerRequest snapTradeApiDisclaimerRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAPIDisclaimerApi : IAPIDisclaimerApiSync, IAPIDisclaimerApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class APIDisclaimerApi : IAPIDisclaimerApi
    {
        private SnapTrade.Net.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="APIDisclaimerApi"/> class.
        /// </summary>
        /// <returns></returns>
        public APIDisclaimerApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="APIDisclaimerApi"/> class.
        /// </summary>
        /// <returns></returns>
        public APIDisclaimerApi(string basePath)
        {
            this.Configuration = SnapTrade.Net.Client.Configuration.MergeConfigurations(
                SnapTrade.Net.Client.GlobalConfiguration.Instance,
                new SnapTrade.Net.Client.Configuration { BasePath = basePath }
            );
            this.Client = new SnapTrade.Net.Client.ApiClient(this.Configuration);
            this.AsynchronousClient = new SnapTrade.Net.Client.ApiClient(this.Configuration);
            this.ExceptionFactory = SnapTrade.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="APIDisclaimerApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public APIDisclaimerApi(SnapTrade.Net.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = SnapTrade.Net.Client.Configuration.MergeConfigurations(
                SnapTrade.Net.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new SnapTrade.Net.Client.ApiClient(this.Configuration);
            this.AsynchronousClient = new SnapTrade.Net.Client.ApiClient(this.Configuration);
            this.ExceptionFactory = SnapTrade.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="APIDisclaimerApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public APIDisclaimerApi(SnapTrade.Net.Client.ISynchronousClient client, SnapTrade.Net.Client.IAsynchronousClient asyncClient, SnapTrade.Net.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = SnapTrade.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public SnapTrade.Net.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public SnapTrade.Net.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public SnapTrade.Net.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public SnapTrade.Net.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Accept or Reject SnapTrade disclaimer agreement 
        /// </summary>
        /// <exception cref="SnapTrade.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="userSecret"></param>
        /// <param name="snapTradeApiDisclaimerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>SnapTradeAPIDisclaimerAcceptStatus</returns>
        public SnapTradeAPIDisclaimerAcceptStatus Accept(string userId, string userSecret, SnapTradeApiDisclaimerRequest snapTradeApiDisclaimerRequest, int operationIndex = 0)
        {
            SnapTrade.Net.Client.ApiResponse<SnapTradeAPIDisclaimerAcceptStatus> localVarResponse = AcceptWithHttpInfo(userId, userSecret, snapTradeApiDisclaimerRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Accept or Reject SnapTrade disclaimer agreement 
        /// </summary>
        /// <exception cref="SnapTrade.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="userSecret"></param>
        /// <param name="snapTradeApiDisclaimerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of SnapTradeAPIDisclaimerAcceptStatus</returns>
        public SnapTrade.Net.Client.ApiResponse<SnapTradeAPIDisclaimerAcceptStatus> AcceptWithHttpInfo(string userId, string userSecret, SnapTradeApiDisclaimerRequest snapTradeApiDisclaimerRequest, int operationIndex = 0)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
            {
                throw new SnapTrade.Net.Client.ApiException(400, "Missing required parameter 'userId' when calling APIDisclaimerApi->Accept");
            }

            // verify the required parameter 'userSecret' is set
            if (userSecret == null)
            {
                throw new SnapTrade.Net.Client.ApiException(400, "Missing required parameter 'userSecret' when calling APIDisclaimerApi->Accept");
            }

            // verify the required parameter 'snapTradeApiDisclaimerRequest' is set
            if (snapTradeApiDisclaimerRequest == null)
            {
                throw new SnapTrade.Net.Client.ApiException(400, "Missing required parameter 'snapTradeApiDisclaimerRequest' when calling APIDisclaimerApi->Accept");
            }

            SnapTrade.Net.Client.RequestOptions localVarRequestOptions = new SnapTrade.Net.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = SnapTrade.Net.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = SnapTrade.Net.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(SnapTrade.Net.Client.ClientUtils.ParameterToMultiMap("", "userId", userId, ""));
            localVarRequestOptions.QueryParameters.Add(SnapTrade.Net.Client.ClientUtils.ParameterToMultiMap("", "userSecret", userSecret, ""));
            localVarRequestOptions.Data = snapTradeApiDisclaimerRequest;

            localVarRequestOptions.Operation = "APIDisclaimerApi.Accept";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (PartnerClientId) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("clientId")))
            {
                localVarRequestOptions.QueryParameters.Add(SnapTrade.Net.Client.ClientUtils.ParameterToMultiMap("", "clientId", this.Configuration.GetApiKeyWithPrefix("clientId")));
            }
            // authentication (PartnerSignature) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Signature")))
            {
                localVarRequestOptions.HeaderParameters.Add("Signature", this.Configuration.GetApiKeyWithPrefix("Signature"));
            }
            // authentication (PartnerTimestamp) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("timestamp")))
            {
                localVarRequestOptions.QueryParameters.Add(SnapTrade.Net.Client.ClientUtils.ParameterToMultiMap("", "timestamp", this.Configuration.GetApiKeyWithPrefix("timestamp")));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<SnapTradeAPIDisclaimerAcceptStatus>("/snapTrade/acceptDisclaimer", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("Accept", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Accept or Reject SnapTrade disclaimer agreement 
        /// </summary>
        /// <exception cref="SnapTrade.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="userSecret"></param>
        /// <param name="snapTradeApiDisclaimerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SnapTradeAPIDisclaimerAcceptStatus</returns>
        public async System.Threading.Tasks.Task<SnapTradeAPIDisclaimerAcceptStatus> AcceptAsync(string userId, string userSecret, SnapTradeApiDisclaimerRequest snapTradeApiDisclaimerRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            SnapTrade.Net.Client.ApiResponse<SnapTradeAPIDisclaimerAcceptStatus> localVarResponse = await AcceptWithHttpInfoAsync(userId, userSecret, snapTradeApiDisclaimerRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Accept or Reject SnapTrade disclaimer agreement 
        /// </summary>
        /// <exception cref="SnapTrade.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="userSecret"></param>
        /// <param name="snapTradeApiDisclaimerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SnapTradeAPIDisclaimerAcceptStatus)</returns>
        public async System.Threading.Tasks.Task<SnapTrade.Net.Client.ApiResponse<SnapTradeAPIDisclaimerAcceptStatus>> AcceptWithHttpInfoAsync(string userId, string userSecret, SnapTradeApiDisclaimerRequest snapTradeApiDisclaimerRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
            {
                throw new SnapTrade.Net.Client.ApiException(400, "Missing required parameter 'userId' when calling APIDisclaimerApi->Accept");
            }

            // verify the required parameter 'userSecret' is set
            if (userSecret == null)
            {
                throw new SnapTrade.Net.Client.ApiException(400, "Missing required parameter 'userSecret' when calling APIDisclaimerApi->Accept");
            }

            // verify the required parameter 'snapTradeApiDisclaimerRequest' is set
            if (snapTradeApiDisclaimerRequest == null)
            {
                throw new SnapTrade.Net.Client.ApiException(400, "Missing required parameter 'snapTradeApiDisclaimerRequest' when calling APIDisclaimerApi->Accept");
            }


            SnapTrade.Net.Client.RequestOptions localVarRequestOptions = new SnapTrade.Net.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = SnapTrade.Net.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = SnapTrade.Net.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(SnapTrade.Net.Client.ClientUtils.ParameterToMultiMap("", "userId", userId, ""));
            localVarRequestOptions.QueryParameters.Add(SnapTrade.Net.Client.ClientUtils.ParameterToMultiMap("", "userSecret", userSecret, ""));
            localVarRequestOptions.Data = snapTradeApiDisclaimerRequest;

            localVarRequestOptions.Operation = "APIDisclaimerApi.Accept";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (PartnerClientId) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("clientId")))
            {
                localVarRequestOptions.QueryParameters.Add(SnapTrade.Net.Client.ClientUtils.ParameterToMultiMap("", "clientId", this.Configuration.GetApiKeyWithPrefix("clientId")));
            }
            // authentication (PartnerSignature) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Signature")))
            {
                localVarRequestOptions.HeaderParameters.Add("Signature", this.Configuration.GetApiKeyWithPrefix("Signature"));
            }
            // authentication (PartnerTimestamp) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("timestamp")))
            {
                localVarRequestOptions.QueryParameters.Add(SnapTrade.Net.Client.ClientUtils.ParameterToMultiMap("", "timestamp", this.Configuration.GetApiKeyWithPrefix("timestamp")));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<SnapTradeAPIDisclaimerAcceptStatus>("/snapTrade/acceptDisclaimer", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("Accept", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
